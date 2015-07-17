import scala.annotation.tailrec

object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    @tailrec
    def sub(a: Int, op: String, b: Int): Unit = {
      op match {
        case "+" =>
          println(a + b)
          sub(sc.nextInt, sc.next, sc.nextInt)
        case "-" =>
          println(a - b)
          sub(sc.nextInt, sc.next, sc.nextInt)
        case "*" =>
          println(a * b)
          sub(sc.nextInt, sc.next, sc.nextInt)
        case "/" =>
          println(a / b)
          sub(sc.nextInt, sc.next, sc.nextInt)
        case _ =>
      }
    }
    sub(sc.nextInt, sc.next, sc.nextInt)

  }
}
