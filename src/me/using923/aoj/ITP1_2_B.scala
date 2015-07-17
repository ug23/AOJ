object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a,b,c = sc.nextInt

    if ((c-b)*(b-a) > 0){
      println("Yes")
    } else {
      println("No")
    }
  }
}
