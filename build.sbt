scalaVersion := "2.13.5"

resolvers += "Spark Snapshots" at "https://repository.apache.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.0-SNAPSHOT",
  "org.apache.spark" %% "spark-sql" % "3.2.0-SNAPSHOT"
)

run / fork := true

