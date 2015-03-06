-------
README 
-------

1. Create Input folder
   hadoop fs -mkdir /user/root/crdemo

2. Create input avro schema and input avro dataset
   kite-dataset create dataset:hdfs:/user/root/crdemo/stocks_raw --schema stocks_raw.avsc
   
3. Create/update the lineage mapping json
   lineage_mapping.json

3. Load incoming raw data into hdfs
   hadoop fs -put stocks.csv /user/root/crdemo/stocks_raw/stocks.csv
   
4. Create and load output schemas in to /user/root/schemas folder
   hadoop fs -put Stocks.avsc /user/root/schemas
   hadoop fs -put StockRanges.avsc /user/root/schemas

5. Run the job
   hadoop jar demo-avro-splits-0.0.1-SNAPSHOT-jar-with-dependencies.jar  com.example.mrtest.DemoAvroMultiDriver /user/root/crdemo/stocks_raw /user/root/crdemo/stocksoutput lineage_mapping.json ComplexRulesDemo
   
6. Check the output
   hadoop fs -ls /user/root/crdemo/stocksoutput
   
7. Create your hive tables
   hive -f create_tables.hql
   
