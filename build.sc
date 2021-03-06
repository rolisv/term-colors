import mill._, scalalib._, scalanativelib._

object termcolors extends ScalaNativeModule {
  def scalaVersion = "2.11.12"
  def scalaNativeVersion = "0.3.8"
  def ivyDeps = Agg(
    ivy"com.lihaoyi::fansi::0.2.5"
  )
  def releaseMode = ReleaseMode.Release
  def upx = T {
    os.proc("upx", "-f", "-o", "term-colors", nativeLink()).call(cwd = T.ctx().dest)
    T.ctx().dest/"term-colors"
  }
}
