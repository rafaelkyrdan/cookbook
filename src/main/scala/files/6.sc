/**
  * Pretending that string is a file
  *
  */

import scala.io.Source

def printLines(source: Source) {
  for (line <- source.getLines) {
    println(line)
  }
}

val s = Source.fromString("foo\nbar\n")
printLines(s)

val filename = "/Users/rafaelkyrdan/projects/cookbook/data/finance.csv"
val f = Source.fromFile(filename)
printLines(f)
