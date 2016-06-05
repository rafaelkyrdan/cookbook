import scala.io.Source

/**
  * Process a CSV file
  *
  */

println("Month, Income, Expenses, Profit")
val filename = "/Users/rafaelkyrdan/projects/cookbook/data/finance.csv"
val bufferedSource = Source.fromFile(filename)

for{
  line <- bufferedSource.getLines()
} {
  val cols = line.split(",").map(_.trim)
  println(s" ${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)} ")

}

bufferedSource.close()
