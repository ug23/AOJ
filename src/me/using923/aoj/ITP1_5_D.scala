object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt

    for(i <- 1 to n) {
      i match {
        case i if i.toString.contains('3') =>
          print(" "+i)
        case i if i % 3 == 0 =>
          print(" "+i)
        case _ =>   
      }
    }
    println
  }
}
