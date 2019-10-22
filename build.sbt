import scala.sys.process._

name := "spark-cdm"

// version := s"0.3.${sys.env.get("BUILDNUMBER")}"
version := ("git describe --tags".!!).trim
organization := "com.microsoft.azure"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.1" % "provided"
libraryDependencies += "com.microsoft.azure" % "adal4j" % "1.6.3"
libraryDependencies += "com.univocity" % "univocity-parsers" % "2.7.6"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

ThisBuild / githubOwner := sys.env.get("GITHUB_USER").getOrElse("")
ThisBuild / githubUser := sys.env.get("GITHUB_USER").getOrElse("")
ThisBuild / githubRepository := sys.env.get("GITHUB_REPO").getOrElse("")
credentials +=
 Credentials(
     s"GitHub Package Registry",
     "maven.pkg.github.com",
     githubOwner.value,
     sys.env.get("GITHUB_TOKEN").getOrElse("")
 )

 
