name := """pure_water_mapper"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

EclipseKeys.createSrc := EclipseCreateSrc.All

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.35"

libraryDependencies += "com.typesafe.slick" % "slick_2.11" % "2.1.0"


