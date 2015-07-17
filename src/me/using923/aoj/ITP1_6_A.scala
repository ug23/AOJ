object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextLine
    val list = sc.nextLine.split(' ').reverse

    println(list.reduce((s, t) => s"$s $t"))

  }
}
