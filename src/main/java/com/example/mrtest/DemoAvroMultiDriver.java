package com.example.mrtest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.avro.mapreduce.AvroKeyOutputFormat;
import org.apache.avro.mapreduce.AvroMultipleOutputs;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.compress.SnappyCodec;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.LazyOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.NullOutputFormat;
import org.kitesdk.data.Dataset;
import org.kitesdk.data.DatasetDescriptor;
import org.kitesdk.data.Datasets;

public class DemoAvroMultiDriver {
	public static void main(String[] args) throws IOException,
			InterruptedException, ClassNotFoundException {

		if (args.length != 4) {
			System.out.println("Incorrect parameters");
			System.out
					.println("Usage:  hadoop jar demo-avro-splits-0.0.1-SNAPSHOT-jar-with-dependencies.jar  com.example.mrtest.DemoAvroMultiDriver <input_folder> <output_folder> <lineage_mapping.json> <job_name>");
			System.exit(-1);
		}

		Path inputPath = new Path(args[0]);
		Path outputDir = new Path(args[1]);

		Configuration conf = new Configuration(true);
		conf.set("mapreduce.custom.lineage", new String(Files.readAllBytes(Paths.get(args[2]))));

		// Create job
		Job job = new Job(conf, args[3]);
		job.setJarByClass(DemoAvroMultiDriver.class);

		// Setup MapReduce
		job.setMapperClass(DemoAvroMultiMapper.class);
		job.setReducerClass(DemoAvroMultiReducer.class);

		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);

		// Input
		FileInputFormat.setInputPaths(job, inputPath);
		job.setInputFormatClass(TextInputFormat.class);

		FileOutputFormat.setOutputPath(job, outputDir);
		// output
		AvroMultipleOutputs.addNamedOutput(job, StockRanges.SCHEMA$.getName(), AvroKeyOutputFormat.class, StockRanges.SCHEMA$);
		AvroMultipleOutputs.addNamedOutput(job, Stocks.SCHEMA$.getName(), AvroKeyOutputFormat.class, Stocks.SCHEMA$);
		AvroKeyOutputFormat.setOutputCompressorClass(job, SnappyCodec.class);
		AvroKeyOutputFormat.setCompressOutput(job, true);
		AvroKeyOutputFormat.setOutputPath(job, outputDir);

		// dummy
		job.setOutputFormatClass(NullOutputFormat.class);
		LazyOutputFormat.setOutputFormatClass(job, AvroKeyOutputFormat.class);

		// Delete output if exists
		FileSystem hdfs = FileSystem.get(conf);
		if (hdfs.exists(outputDir))
			hdfs.delete(outputDir, true);

		// Execute job
		int code = job.waitForCompletion(true) ? 0 : 1;

		if (code == 0) {
			DatasetDescriptor descriptor = new DatasetDescriptor.Builder()
					.schemaUri("hdfs:/user/root/schemas/Stocks.avsc").build();
			Dataset<Stocks> stocks = Datasets.create("dataset:hdfs:" + args[1]
					+ "/" + Stocks.SCHEMA$.getName(), descriptor, Stocks.class);

			descriptor = new DatasetDescriptor.Builder().schemaUri(
					"hdfs:/user/root/schemas/StockRanges.avsc").build();
			Dataset<StockRanges> stockRanges = Datasets.create("dataset:hdfs:"
					+ args[1] + "/" + StockRanges.SCHEMA$.getName(),
					descriptor, StockRanges.class);
		}
		
		System.exit(code);
	}

}
