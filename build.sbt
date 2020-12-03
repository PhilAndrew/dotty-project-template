val dottyVersion = "3.0.0-M2"



lazy val root = project
  .enablePlugins(NativeImagePlugin)
  .in(file("."))
  .settings(
    Compile / mainClass := Some("Main"),
    name := "dotty-simple",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )

