object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val rawsec = sc.nextInt

    val hour = rawsec / 3600
    val min = (rawsec - hour*3600) / 60 
    
    println(s"$hour $min ${rawsec-hour*3600-min*60}")
  }
}
