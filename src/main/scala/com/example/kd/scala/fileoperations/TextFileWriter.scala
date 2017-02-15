package com.example.kd.scala.fileoperations

import org.apache.spark.sql.DataFrame
import com.example.kd.scala.traits.CustomFileWriter
object TextFileWriter extends CustomFileWriter {
  override def write(df: DataFrame, location: String, writeSingle: Boolean) = {
    if (writeSingle) {
      df.coalesce(1).rdd.saveAsTextFile("users")
    }
  }
}