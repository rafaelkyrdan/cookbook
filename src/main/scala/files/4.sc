import scala.io.Source

/**
  * Process every character
  *
  */
val filename = "/Users/rafaelkyrdan/projects/cookbook/data/lorem.txt"
val source = Source.fromFile(filename)

for {
  char <- source
} println(char)

source.close()

// much faster
val source2 = Source.fromFile(filename)
for {
  line <- source2.getLines()
  char <- line
} println(char)

source2.close()

