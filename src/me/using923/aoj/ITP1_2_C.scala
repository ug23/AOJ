object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a = sc.nextInt
    val b = sc.nextInt
    val c = sc.nextInt

    val list = List(a,b,c).sorted.map(_.toString)
    val ans = list.reduce((l,r) => l+ " " + r)

    pritntln(ans)

  }
}
