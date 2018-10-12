import sbt._

val appName = "git-stamp"

lazy val library = Project(appName, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    majorVersion := 1,
    scalaVersion := "2.12.7",
    makePublicallyAvailableOnBintray := true,
    libraryDependencies ++= LibDependencies.compile ++ LibDependencies.test
  )
