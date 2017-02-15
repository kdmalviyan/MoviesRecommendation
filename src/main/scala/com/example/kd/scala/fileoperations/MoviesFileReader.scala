package com.example.kd.scala.fileoperations

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession
import com.example.kd.scala.traits.CustomFileReader

object MoviesFileReader extends CustomFileReader {
  override def read(filename: String, sparkSession: SparkSession): DataFrame = {
    val df = sparkSession.read.
      option("header", "true").
      option("mode", "DROPMALFORMED").
      format("com.databricks.spark.csv").
      csv(filename)
    df
  }
}