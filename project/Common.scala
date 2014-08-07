import sbt._
import Keys._
import play.Play.autoImport._

object Common {
  val settings: Seq[Setting[_]] = Seq(
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.1"
  )

  val dependencies = Seq(
    javaJdbc,
    javaEbean,
    cache,
    javaWs
  )
}