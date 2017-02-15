package com.example.kd.scala.fileoperations
import org.apache.spark.sql.DataFrame
import com.example.kd.scala.traits.CustomFileWriter
object CSVFileWriter extends CustomFileWriter {
  override def write(df: DataFrame, location: String, writeSingle: Boolean) = {
    if (writeSingle) {
      df.coalesce(1)
        .write.format("com.databricks.spark.csv")
        .option("header", "true")
        .save(location)
    }
  }
}
