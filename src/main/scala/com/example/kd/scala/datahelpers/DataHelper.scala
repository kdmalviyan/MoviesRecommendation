package com.example.kd.scala.datahelpers

import com.example.kd.scala.fileoperations.CSVFileWriter
import java.util.Date
import org.apache.spark.sql.functions._

object DataHelper {
  def prepareUsers(sparkSession: org.apache.spark.sql.SparkSession) = {
    val userIds = sparkSession.sql("select distinct userId from ratings").distinct().orderBy(asc("userId"))
    CSVFileWriter.write(userIds, "users" + new Date().getTime, true)
  }
}