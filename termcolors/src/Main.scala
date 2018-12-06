object Main {
  def main(args: Array[String]): Unit = {
    val colorMapStr = (0 to 255).map(i => fansi.Color.Full(i)(f"colour$i%-3s ")).grouped(16).map(_.mkString).mkString("\n")

    println(colorMapStr)
  }
}
