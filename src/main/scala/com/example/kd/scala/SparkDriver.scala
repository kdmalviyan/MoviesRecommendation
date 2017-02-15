package com.example.kd.scala

import com.example.kd.scala.fileoperations.CSVFileWriter
import com.example.kd.scala.fileoperations.MoviesFileReader
import java.util.Date
import com.example.kd.scala.datahelpers.DataHelper
import com.example.kd.scala.operations.MoviesOperations

object SparkDriver {
  def main(args: Array[String]): Unit = {
    val sparkSession = new SparkContextFactory().getSparkSession("local")
    MoviesFileReader.read("/home/impadmin/Desktop/learning/Spark/ml-latest-small/movies.csv", sparkSession).createOrReplaceTempView("movies")
    MoviesFileReader.read("/home/impadmin/Desktop/learning/Spark/ml-latest-small/ratings.csv", sparkSession).createOrReplaceTempView("ratings")
    MoviesFileReader.read("/home/impadmin/Desktop/learning/Spark/ml-latest-small/users.csv", sparkSession).createOrReplaceTempView("users")
    MoviesOperations.moviesCountByGenre("movies", sparkSession)
    MoviesOperations.moviesByGenre("movies", sparkSession, genre = "Fantasy")
    MoviesOperations.moviesByGenre("movies", sparkSession)
  }
}