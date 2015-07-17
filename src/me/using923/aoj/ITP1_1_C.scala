object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val height,width = sc.nextInt

    val area = height * width
    val around = height * 2 + width * 2
    println(s"$area $around")
  }
}
