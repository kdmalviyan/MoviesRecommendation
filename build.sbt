name := "MoviesRecommendation"

version := "1.0"

scalaVersion := "2.11.8"

// additional libraries

//Spark
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"
//libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.1.0"
//libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.1.0"

libraryDependencies += "org.apache.spark" % "spark-hive_2.11" % "2.1.0"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.35"

//libraryDependencies += "org.apache.spark" % "spark-streaming-flume_2.11" % "2.1.0"

//libraryDependencies += "org.apache.spark" % "spark-streaming-kafka_2.11" % "1.6.3"
//libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-assembly_2.11" % "1.6.3"

//libraryDependencies += "org.apache.spark" % "spark-streaming-twitter_2.11" % "1.6.3"

//Hadoop
libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-api" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-client" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-common" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-server-common" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-core" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-server-web-proxy" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-server-nodemanager" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-shuffle" % "2.7.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-server-resourcemanager" % "2.7.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.7" % "test"
libraryDependencies += "org.apache.curator" % "curator-framework" % "2.7.1"
libraryDependencies += "javax.activation" % "activation" % "1.1"
libraryDependencies += "javax.servlet.jsp" % "javax.servlet.jsp-api" % "2.2.1"
libraryDependencies += "xerces" % "xercesImpl" % "2.9.1"
libraryDependencies += "com.jcraft" % "jsch" % "0.1.42"
libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1"
libraryDependencies += "com.sun.xml.bind" % "jaxb-impl" % "2.2.3"
libraryDependencies += "xml-apis" % "xml-apis" % "1.3.04"
libraryDependencies += "org.apache.curator" % "curator-recipes" % "2.7.1"
libraryDependencies += "javax.xml.stream" % "stax-api" % "1.0-2"
libraryDependencies += "asm" % "asm" % "3.1"
libraryDependencies += "org.hsqldb" % "hsqldb" % "2.0.0"
libraryDependencies += "jline" % "jline" % "2.14"
libraryDependencies += "junit" % "junit" % "4.12"
libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.8"
libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.11.8"
libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.6"
libraryDependencies += "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.5.0"
libraryDependencies += "com.typesafe.scala-logging" % "scala-logging-slf4j_2.11" % "2.1.2"
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.11.8"
