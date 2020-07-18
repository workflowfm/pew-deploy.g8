ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "$version$"
ThisBuild / organization     := "$organization$"

// Fixes some sbt import problems.
// https://github.com/sbt/sbt-native-packager/issues/1063
resolvers += Resolver.sbtPluginRepo("releases")

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,
    
    libraryDependencies += "uk.ac.ed.inf" %% "subakka" % "0.1-SNAPSHOT",
    libraryDependencies += "com.workflowfm" %% "pew" % "1.4.0-SNAPSHOT",

    libraryDependencies += "com.typesafe.akka" %% "akka-stream-kafka" % "0.21.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream"       % "2.5.13",

    libraryDependencies += "org.apache.kafka"  %% "kafka"             % "1.1.0",
    libraryDependencies += "org.apache.kafka"  %  "kafka-streams"     % "1.1.0"
  )

