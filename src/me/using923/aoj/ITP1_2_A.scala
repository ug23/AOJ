object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a = sc.nextInt
    val b = sc.nextInt

    (a - b) match {
      case d if d < 0  =>
        println("a < b")
      case d if d == 0 =>
        println("a == b")
      case _ =>
        println("a > b")
    }
  }
}
