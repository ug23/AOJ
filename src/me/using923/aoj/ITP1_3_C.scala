import scala.annotation.tailrec

object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    try {
      @tailrec
      def sub(x: Int,y: Int): Unit = {
        if (x == 0 && y == 0) {} 
        else {
          val ans = if(x < y) Array(x,y) else Array(y,x)
          println(s"${ans(0)} ${ans(1)}")
          sub(sc.nextInt,sc.nextInt)
        }
      }
      sub(sc.nextInt,sc.nextInt)
    } catch {
      case e: NoSuchElementException =>
        println("error: stdin is not found. Please take numbers.")
    }
  }
}
