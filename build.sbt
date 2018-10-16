import sbt._

val appName = "git-stamp"

lazy val library = Project(appName, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    majorVersion := 1,
    scalaVersion := "2.11.12",
    makePublicallyAvailableOnBintray := true,
    libraryDependencies ++= LibDependencies.compile ++ LibDependencies.test
  )
