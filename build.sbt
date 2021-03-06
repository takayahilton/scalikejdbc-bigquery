name := "scalikejdbc-bigquery"

organization := "com.mayreh"

licenses += (("Apache-2.0", url("https://raw.githubusercontent.com/ocadaruma/scalikejdbc-bigquery/master/LICENSE")))

version := "0.1.5-SNAPSHOT"

publishMavenStyle := true

val scala211 = "2.11.8"

scalaVersion := scala211

crossScalaVersions := Seq(scala211, "2.12.8", "2.13.0")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

configs(IntegrationTest)

inConfig(IntegrationTest)(Defaults.itSettings)

val scalikejdbcVersion = "3.3.5"
val googleCloudVersion = "1.75.0"

libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc" % scalikejdbcVersion % "provided,it,test",

  "com.google.cloud" % "google-cloud-bigquery" % googleCloudVersion % "provided,it,test",

  "org.scalatest" %% "scalatest" % "3.0.8" % "it,test",
  "org.scalamock" %% "scalamock" % "4.3.0" % "it,test"
)
