package com.example.mrtest;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class DemoAvroMultiMapper extends Mapper<Object, Text, Text, Text> {

	@Override
	public void map(Object key, Text value, Context context)
			throws IOException, InterruptedException {
		String line = value.toString();
		String[] split = line.split(",");

		String name = split[0];
		if (name != null) {
			context.write(new Text(name), new Text(value));
		}
	}
}