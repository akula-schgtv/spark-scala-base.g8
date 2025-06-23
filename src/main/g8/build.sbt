val sparkVersion = "$sparkVersion$"

lazy val commonSettings = Seq(
  javaOptions ++= Seq("-Xms512M", "-Xmx2048M"),
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-Xfuture",
    "-encoding",
    "UTF-8",
    "-unchecked",
    "-language:postfixOps"
  ),
  checksums in update := Nil
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "$name$",
    version := "$version$",
    organization := "$organization$",
    scalaVersion := "$scalaVersion$",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion % Provided,
      "org.apache.spark" %% "spark-sql" % sparkVersion % Provided,
      "org.apache.spark" %% "spark-hive" % sparkVersion % Provided,
      "org.rogach" %% "scallop" % "5.2.0",
      "com.typesafe" % "config" % "1.4.3",
      "org.scalatest" %% "scalatest" % "3.2.19" % Test
    ),
    parallelExecution in Test := false,

    assembly / mainClass := Some("$organization$.$classname$"),

    assembly / test := {},

    assembly / assemblyJarName := "$name$-$version$.jar",

    assembly / assemblyMergeStrategy := {
      case m if m.toLowerCase.endsWith("manifest.mf") => MergeStrategy.discard
      case m if m.toLowerCase.matches("meta-inf.*\\\.sf\$") => MergeStrategy.discard
      case "reference.conf" => MergeStrategy.concat
      case x: String if x.contains("UnusedStubClass.class") => MergeStrategy.first
      case _ => MergeStrategy.first
    }
  )