logLevel := Level.Info

resolvers += Resolver.url("hmrc-sbt-plugin-releases",
  url("https://dl.bintray.com/hmrc/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "0.1.5")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0")
