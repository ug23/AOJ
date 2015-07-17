import scala.math._

object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    try {
      val r = sc.nextDouble
      val area:Double = Pi * r * r
      val around:Double = Pi * r * 2
      println(f"$area%f $around%f")
    } catch {
      case e: NoSuchElementException =>
        println("error: stdin is not found. Please take numbers.")
    }
  }
}