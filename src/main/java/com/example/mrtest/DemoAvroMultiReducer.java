package com.example.mrtest;

import java.io.IOException;

import org.apache.avro.mapred.AvroKey;
import org.apache.avro.mapreduce.AvroMultipleOutputs;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class DemoAvroMultiReducer extends
		Reducer<Text, Text, AvroKey<Stocks>, NullWritable> {

	private AvroMultipleOutputs avroMultipleOutputs;

	@Override
	protected void setup(Context context) {
		avroMultipleOutputs = new AvroMultipleOutputs(context);
	}

	public void reduce(Text key, Iterable<Text> values, Context context)
			throws IOException, InterruptedException {

		StockRanges stockRanges = new StockRanges();
		double minVal = Double.MAX_VALUE;
		double maxVal = Double.MIN_VALUE;
		stockRanges.setSymbol(key.toString());

		for (Text value : values) {
			String[] csv = value.toString().split(",");
			if (csv.length == 7) {
				Stocks stock = new Stocks();
				stock.setSymbol(csv[0]);
				stock.setDate(csv[1]);
				stock.setOpen(new Double(csv[2]));
				stock.setHigh(new Double(csv[3]));
				stock.setLow(new Double(csv[4]));
				stock.setClose(new Double(csv[5]));
				stock.setVolume(new Long(csv[6]));

				if (minVal > stock.getLow())
					minVal = stock.getLow();

				if (maxVal < stock.getHigh())
					maxVal = stock.getHigh();

				avroMultipleOutputs.write(
						Stocks.SCHEMA$.getName(),
						new AvroKey<Stocks>(stock),
						NullWritable.get(),
						Stocks.SCHEMA$.getName() + "/"
								+ Stocks.SCHEMA$.getName());
			}
		}

		stockRanges.setHigh(maxVal);
		stockRanges.setLow(minVal);
		avroMultipleOutputs.write(
				StockRanges.SCHEMA$.getName(),
				new AvroKey<StockRanges>(stockRanges),
				NullWritable.get(),
				StockRanges.SCHEMA$.getName() + "/"
						+ StockRanges.SCHEMA$.getName());
	}

	@Override
	protected void cleanup(Context context) throws IOException,
			InterruptedException {
		avroMultipleOutputs.close();
	}
}