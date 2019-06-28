package com.yc.dev.spark

import org.apache.spark.sql.SparkSession

/**
  * DataFrame API基本操作
  */
object DataFrameApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("DataFrameApp").master("local[2]").getOrCreate()
   //将文件加载到dataFrame
    val peopleDF = spark.read.format("json").load("file:///project/people.json")
   //输出schema 信息
    peopleDF.printSchema()
    //数据集前20条
    peopleDF.show()
    //查询某列的所有数据 select name from table
    peopleDF.select("name").show()

    //查询某几列所有数据，并对列进行计算 select name,age,age+10 as age2 from table
    peopleDF.select(peopleDF.col("name"), peopleDF.col("age")+10).as("age2").show()
    //select * from table where age>19
    peopleDF.filter(peopleDF.col("age") > 19).show()
    //select age,count(1) from table group by age
    peopleDF.groupBy("age").count().show()

    //关闭
    spark.close()
  }

}
