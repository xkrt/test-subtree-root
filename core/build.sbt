ThisBuild / organization := "com.github.xkrt"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.19"

lazy val core = (project in file("core"))
  .settings(
  )

lazy val coreRunner = (project in file("core-runner"))
  .dependsOn(core)
  .settings(
  )
