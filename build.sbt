name := "AhoCorasickRedis"

version := "1.0"

scalaVersion := "2.12.1"

// redis
libraryDependencies +=  "net.debasishg" %% "redisclient" % "3.4"
// scala test
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
logBuffered in Test := false

//excludeFilter in unmanagedSources := "AhoCorasickRedis.scala" || "AhoCorasickRedisSpec.scala"
excludeFilter in unmanagedSources := "FirstSpec.scala"

