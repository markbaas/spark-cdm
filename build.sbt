enablePlugins(GitVersioning)

name := "spark-cdm"

// version := s"0.3.${sys.env.get("BUILDNUMBER")}"

scalaVersion := "2.11.8"

git.useGitDescribe := true
git.baseVersion := "0.3"

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

 
