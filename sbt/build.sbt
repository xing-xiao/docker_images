
name := "FlinkTIEngine"

version := "0.2.5"

scalaVersion := "2.11.12"

val flinkVersion = "1.4.0"

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion % "provided",
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion % "provided",
  "org.apache.flink" %% "flink-clients" % flinkVersion % "provided",
  "org.apache.flink" %% "flink-connector-kafka-0.10" % flinkVersion,
  "com.sksamuel.elastic4s" % "elastic4s-core_2.11" % "6.1.4",
  "com.sksamuel.elastic4s" % "elastic4s-http_2.11" % "6.1.4",
  "org.json4s" %% "json4s-native" % "3.6.0-M2",
  "org.yaml" % "snakeyaml" % "1.8",
  "net.debasishg" %% "redisclient" % "3.5"
)

// exclude Scala library from assembly
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)