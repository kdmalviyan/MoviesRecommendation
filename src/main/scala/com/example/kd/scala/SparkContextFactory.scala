package com.example.kd.scala

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

class SparkContextFactory {
  def getSparkContext(environment: String): SparkContext = {
    val sparkConfig = prepareSparkConfig(environment)
    var sparkContext: SparkContext = null
    if (sparkConfig != null) {
      sparkContext = new SparkContext(sparkConfig)
    }
    sparkContext
  }

  def prepareSparkConfig(environment: String): SparkConf = {
    var config: SparkConf = null
    if (environment != null && (environment.equalsIgnoreCase("local")
      || environment.equalsIgnoreCase("standalone"))) {
      config = new SparkConf().setMaster("local[2]").setAppName("Movies Recommendation")
    } else if (environment != null && (environment.equalsIgnoreCase("yarn")
      || environment.equalsIgnoreCase("cluster"))) {
      //config = new SparkConf()
      //will implement later
    }
    return config
  }
}