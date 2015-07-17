import scala.annotation.tailrec

object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    try {
      @tailrec
      def sub(n: Int, count: Int): Unit = {
        if (n == 0) {

        } else {
          println(s"Case ${count}: ${n}")
          sub(sc.nextInt, count + 1)
        }
      }
      sub(sc.nextInt, 1)
    } catch {
      case e: NoSuchElementException =>
        println("error: stdin is not found. Please take numbers.")
    }
  }
}
