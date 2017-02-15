package com.example.kd.scala

import org.apache.spark.sql.SparkSession

object SparkSessionExample {
  def main(args: Array[String]) : Unit={
    val spark = SparkSession
  .builder().master("local")
  .appName("Spark SQL basic example")
  .getOrCreate()

// For implicit conversions like converting RDDs to DataFrames
import spark.implicits._
  }
}