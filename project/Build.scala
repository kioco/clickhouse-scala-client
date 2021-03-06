import sbt._
object Build {

  val AkkaVersion     = "2.5.30"
  val AkkaHttpVersion = "10.1.11"

  val testDependencies = Seq("org.scalatest" %% "scalatest" % "3.1.1",
                             "com.typesafe.akka" %% "akka-testkit"   % AkkaVersion,
                             "ch.qos.logback"    % "logback-classic" % "1.2.3")

}
