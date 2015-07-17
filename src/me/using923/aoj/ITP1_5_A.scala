object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    
    def printRect(w:Int, h:Int):Unit = {
      if(w==0&&h==0){}
      else {
        for( i <- 1 to h) {
          println("#"*w)
        }
        println
        printRect(sc.nextInt,sc.nextInt)
      }
    }

    printRect(sc.nextInt,sc.nextInt)

  }
}
