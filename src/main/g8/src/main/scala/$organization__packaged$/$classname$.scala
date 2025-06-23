package $organization$

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object $classname$ {
	
	def main(args:Array[String]): Unit = {
		val sparkConf: SparkConf = new SparkConf()

		val spark: SparkSession = SparkSession.builder.config(sparkConf).getOrCreate()

		/**
		 * 
		 * Your Code goes here
		 **/

		spark.stop()

	}
}