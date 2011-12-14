organization := "prasinous"

name := "salat-ignore-demo"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT", 
  "org.slf4j" % "slf4j-simple" % "1.6.4"
)

resolvers += "novus-snaps-repo" at "http://repo.novus.com/snapshots/"

scalacOptions := Seq("-deprecation")
