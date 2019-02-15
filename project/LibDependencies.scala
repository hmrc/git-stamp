import sbt._

private object LibDependencies {
  val compile: Seq[ModuleID] = Seq(
    "com.github.nscala-time" %% "nscala-time" % "2.22.0",
    "org.eclipse.jgit" % "org.eclipse.jgit" % "3.7.1.201504261725-r"
  )

  val test: Seq[ModuleID] = Seq(
    "org.pegdown"   % "pegdown"      % "1.6.0" % Test,
    "org.scalatest" %% "scalatest"   % "3.0.5" % Test
  )
}
