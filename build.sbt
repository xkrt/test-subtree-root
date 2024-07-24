ThisBuild / organization := "com.github.xkrt"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.19"

lazy val rootRunner = (project in file("root-runner"))
  .dependsOn(core)
  .settings(
  )

lazy val core = (project in file("core/core"))
  .settings(
  )
