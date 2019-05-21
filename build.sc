import mill._, scalalib._

object main extends Cross[MainModule]("2.11.12", "2.12.8", "2.13.0-RC2")

class MainModule(val crossScalaVersion: String) extends CrossSbtModule {

  def ivyDeps = Agg(
    ivy"${scalaOrganization()}:scala-compiler:${scalaVersion()}",
    ivy"${scalaOrganization()}:scalap:${scalaVersion()}"
  )

}

