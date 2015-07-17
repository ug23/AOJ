object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    def printFrame(h: Int,w: Int): Unit = {
      if (w != 0 || h != 0) {
        val rectBase = "#" * w
        val hollow = rectBase.patch(1, "." * (w - 2), w - 2)

        println(rectBase)
        for (i <- 1 to h - 2) {
          println(hollow)
        }
        println(rectBase)
        println

        printFrame(sc.nextInt, sc.nextInt)

      }
    }

    printFrame(sc.nextInt, sc.nextInt)

  }
}
