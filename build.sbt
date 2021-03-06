name := "article_search"

version := "1.0"

scalaVersion := "2.11.4"

retrieveManaged := true

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.28",
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "com.typesafe.slick" %% "slick-codegen" % "2.1.0-RC3",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "org.scalaj" %% "scalaj-http" % "1.1.0",
  "io.spray" %%  "spray-json" % "1.3.1"
)

scalariformSettings