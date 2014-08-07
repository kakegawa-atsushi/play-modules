name := """play-modules"""

Common.settings

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .dependsOn(core, batch)

lazy val core = (project in file("./modules/core"))

lazy val batch = (project in file("./modules/batch"))
  .enablePlugins(PlayJava)
  .dependsOn(core)

libraryDependencies ++= Common.dependencies

