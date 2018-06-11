

name := "binding.scala-playfield"


lazy val p = (project in file("."))
        .enablePlugins(ScalaJSPlugin)
        .settings(
            version := "0.1",
            scalaVersion := "2.12.6",
            libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "11.0.1",
            libraryDependencies += "com.thoughtworks.binding" %%% "futurebinding" % "11.0.1",
            addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
        )