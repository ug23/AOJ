object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)

    try {
      val a = sc.nextInt
      val b = sc.nextInt
      val c = sc.nextInt

      def sub(x:Int):Int = {
        if(c % x == 0) 1 else 0
      } 
      println(Range(a,b+1).map(sub).sum)
    } catch {
      case e: NoSuchElementException =>
        println("error: stdin is not found. Please take numbers.")
    }
  }
}
