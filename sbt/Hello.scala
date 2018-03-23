package example
import com.redis.{RedisClient, RedisClientPool}
import org.apache.flink.api.common.restartstrategy.RestartStrategies
import org.apache.flink.api.common.serialization.SimpleStringSchema
import org.apache.flink.api.java.utils.ParameterTool
import org.apache.flink.streaming.api.scala._
import org.apache.flink.api.common.functions.{AggregateFunction, ReduceFunction}
import org.apache.flink.streaming.connectors.kafka.{FlinkKafkaConsumer010, FlinkKafkaProducer010}
import org.apache.flink.streaming.api.windowing.time.Time
import org.json4s._
import org.json4s.JsonDSL._
import org.json4s.native.JsonMethods._
import org.json4s.DefaultFormats
import org.json4s.native.Serialization

object Hello {
  def main(args:Array[String]):Unit = {
    println("hello")
    println(parse("""{"a":"b"}"""))
  }
}
