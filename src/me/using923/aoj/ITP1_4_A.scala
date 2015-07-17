object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    try {
      val a = sc.nextInt
      val b = sc.nextInt

      val d = a/b
      val r = a%b
      val f = a.toDouble / b.toDouble
      println(s"$d $r "+f"$f%f")
    } catch {
      case e: NoSuchElementException =>
        println("error: stdin is not found. Please take numbers.")
    }
  }
}
