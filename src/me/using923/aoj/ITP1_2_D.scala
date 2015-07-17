object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val W = sc.nextInt
    val H = sc.nextInt
    val x = sc.nextInt
    val y = sc.nextInt
    val r = sc.nextInt

    val square =
      List((x + r, y), (x, y + r), (x - r, y), (x, y - r),
        (x + r, y + r), (x + r, y - r), (x - r, y + r), (x - r, y - r))
    val safe = square.map {
      case (t, u) =>
        t >= 0 && t <= W && u >= 0 && u <= H
      case _ => false
    }.reduce((l, r) => l && r)

    if (safe) {
      println("Yes")
    } else {
      println("No")
    }
  }
}
