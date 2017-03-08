/**
  * Created by wdw on 3/2/17.
  */

import org.apache.spark.SparkContext
//import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
//import org.apache.spark.{SparkConf, SparkContext}

object test {

  def main(args: Array[String]): Unit = {

    val inputFile =  "file://home/testword"
    val conf = new SparkConf().setAppName("WordCount").setMaster("local")

    //eeeee
    val sc = new SparkContext(conf)
    val textFile = sc.textFile(inputFile)
    val wordCount = textFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b)
    wordCount.foreach(println)

    println(inputFile)
    println(1+4)
    print("ssssssssssssssssssssss")
    //inputFile.toString()
  }

}
