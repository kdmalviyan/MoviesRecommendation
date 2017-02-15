package com.example.kd.scala.traits

import org.apache.spark.sql.DataFrame

trait CustomFileWriter {
  def write(df: DataFrame, location : String, writeSingle: Boolean)
}