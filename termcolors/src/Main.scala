object Main {
  private val baseColors =
    List("Black", "Red", "Green", "Yellow", "Blue", "Magenta", "Cyan", "White")
  private val ansiColors = baseColors ++ baseColors.map("Bright" + _)

  private val namedColors = ansiColors.indices.zip(ansiColors).toMap
  private val maxColorNameLen = ansiColors.map(_.length).max
  private val colorSpacing = 1

  def main(args: Array[String]): Unit = {
    val colorMapStr = (0 to 255)
      .map { i =>
        val color = namedColors.getOrElse(i, "colour" + i).padTo(maxColorNameLen + colorSpacing, ' ')
        fansi.Color.Full(i)(color)
      }
      .grouped(8)
      .map(_.mkString)
      .mkString("\n")

    println(colorMapStr)
  }
}
