import sbt._

private object LibDependencies {
  val compile: Seq[ModuleID] = Seq(
    "com.github.nscala-time" %% "nscala-time" % "2.20.0",
    "org.eclipse.jgit" % "org.eclipse.jgit" % "3.6.1.201501031845-r"
  )

  val test: Seq[ModuleID] = Seq(
    "org.pegdown"   % "pegdown"      % "1.6.0" % Test,
    "org.scalatest" %% "scalatest"   % "3.0.5" % Test
  )
}
