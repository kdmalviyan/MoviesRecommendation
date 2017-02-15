package com.example.kd.scala.traits

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession
trait CustomFileReader {
  def read(fileName: String, sparkSession: SparkSession): DataFrame
}