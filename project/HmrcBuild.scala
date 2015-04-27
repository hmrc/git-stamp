/*
 * Copyright 2015 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import sbt.Keys._
import sbt._
import uk.gov.hmrc.DefaultBuildSettings._
import uk.gov.hmrc.SbtAutoBuildPlugin

object HmrcBuild extends Build {

  val appName = "git-stamp"
  val appVersion = "0.3.0-SNAPSHOT"

  lazy val project = Project(appName, file("."))
    .enablePlugins(SbtAutoBuildPlugin)
    .settings(
      version := appVersion,
      targetJvm := "jvm-1.7",
      scalaVersion := "2.10.4",
      libraryDependencies ++= Seq(
        "com.github.nscala-time" %% "nscala-time" % "1.8.0",
        "org.eclipse.jgit" % "org.eclipse.jgit" % "3.6.1.201501031845-r",
        "org.scalatest" %% "scalatest" % "2.2.4" % "test"
      ),
      BuildDescriptionSettings()
    )
}


object BuildDescriptionSettings {

  def apply() =
    pomExtra := <url>https://www.gov.uk/government/organisations/hm-revenue-customs</url>
      <licenses>
        <license>
          <name>Apache 2</name>
          <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
        </license>
      </licenses>
      <scm>
        <connection>scm:git@github.com:hmrc/releaser.git</connection>
        <developerConnection>scm:git@github.com:hmrc/releaser.git</developerConnection>
        <url>git@github.com:hmrc/releaser.git</url>
      </scm>
      <developers>
        <developer>
          <id>duncancrawford</id>
          <name>Duncan Crawford</name>
          <url>http://www.equalexperts.com</url>
        </developer>
        <developer>
          <id>charleskubicek</id>
          <name>Charles Kubicek</name>
          <url>http://www.equalexperts.com</url>
        </developer>
        <developer>
          <id>stevesmith</id>
          <name>Steve Smith</name>
          <url>http://www.equalexperts.com</url>
        </developer>
      </developers>
}
