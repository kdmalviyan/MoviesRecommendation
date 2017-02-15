package com.example.kd.scala.operations
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession

object MoviesOperations {
  def moviesCountByGenre(movies: String, sparkSession: SparkSession): Unit = {
    val moviesByGenre = sparkSession.sql("select * from " + movies).groupBy("genres")
    val result = moviesByGenre.count().filter(row => row.apply(0).toString().contains("Mystery|IMAX"))
  }

  def moviesByGenre(movies: String, sparkSession: SparkSession, genre: String = "Drama|Romance"): Unit = {
    val moviesByGenre = sparkSession.sql("select genres, title from " + movies).
      filter(column => column.apply(0).toString().contains(genre))
  }
}