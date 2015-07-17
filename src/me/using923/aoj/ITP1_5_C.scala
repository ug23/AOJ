object Main {
  val sc = new java.util.Scanner(System.in)

  // x,yの座標のマスを塗る。
  // x+y が偶数なら# 奇数なら. をかえす
  def cell(x:Int,y:Int):String = {
    (x + y) match{
      case n if n%2==0 => "#"
      case n if n%2==1 => "."
      case _ => ""
    }
  }

  def printChaseboard(h: Int,w: Int): Unit = {
      if (w != 0 || h != 0) {
        
        for( i <- 1 to h) {
          for( j <- 1 to w) {
            print(cell(i,j))
          }
          println
        }

        println
        printChaseboard(sc.nextInt, sc.nextInt)
      }
    }


  def main(args: Array[String]): Unit = {
    printChaseboard(sc.nextInt, sc.nextInt)
  }
}
