object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLine
    val line = sc.nextLine

    val list = line.split(' ').map(_.toLong)
    println(s"${list.min} ${list.max} ${list.sum}")
  }
}
