package com.example.kd.scala

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SparkDriver {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContextFactory().getSparkContext("local")
    val data = 1 to 5
    sc.parallelize(data)
  }
}