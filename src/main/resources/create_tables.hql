CREATE EXTERNAL TABLE stocks
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED AS
INPUTFORMAT 'org.apache.hadoop.hive.ql.io.avro.AvroContainerInputFormat'
OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.avro.AvroContainerOutputFormat'
LOCATION '/user/root/crdemo/stocksoutput/Stocks'
TBLPROPERTIES ('avro.schema.url'='hdfs:///user/root/schemas/Stocks.avsc');

CREATE EXTERNAL TABLE stock_ranges
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.avro.AvroSerDe'
STORED AS
INPUTFORMAT 'org.apache.hadoop.hive.ql.io.avro.AvroContainerInputFormat'
OUTPUTFORMAT 'org.apache.hadoop.hive.ql.io.avro.AvroContainerOutputFormat'
LOCATION '/user/root/crdemo/stocksoutput/StockRanges'
TBLPROPERTIES ('avro.schema.url'='hdfs:///user/root/schemas/StockRanges.avsc');