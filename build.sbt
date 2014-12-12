net.virtualvoid.sbt.graph.Plugin.graphSettings

name := "sample-fuzzy-logic"

version := "1.0"

scalaVersion := "2.11.4"

javacOptions ++= Seq("-g", "-encoding", "UTF-8", "-source", "1.7", "-target", "1.7")

libraryDependencies += "net.sourceforge.jFuzzyLogic" % "jFuzzyLogicCore" % "1.0"

EclipseKeys.withSource := true

resolvers += Resolver.mavenLocal
