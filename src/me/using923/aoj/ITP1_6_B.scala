import scala.collection.mutable._

object Main {
  val sc = new java.util.Scanner(System.in)

  def main(args: Array[String]): Unit = {
    val n: Int = sc.nextLine.toInt
    val suits = List("S", "H", "C", "D")
    val mlist = scala.collection.mutable.MutableList.empty[(String, Int)]
    for (i <- 1 to n) {
      val Array(suit, rank) = sc.nextLine.split(' ')
      mlist += suit -> rank.toInt
    }

    val cards 

   .foreach { s =>
      Range(1, 13 + 1).filterNot(i => cards(s).indexOf(i) == (-1))
        .foreach(i => println(s"$s $i"))
    }

  }
}
