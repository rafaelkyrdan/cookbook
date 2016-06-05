/**
  * Reading form file
  *
  */

import scala.io.Source

val filename = "/Users/rafaelkyrdan/projects/cookbook/data/lorem.txt"

//for {
//  line <- Source.fromFile(filename).getLines()
//} println(line)

//val fileContent = Source.fromFile(filename).getLines().mkString


val bufferedSource = Source.fromFile(filename)
for {
  line <- bufferedSource.getLines()
} println(line)
bufferedSource.close()


def using[A <: { def close(): Unit }, B](resource: A)(f: A => B): B = {
  try {
    f(resource)
  } finally {
    resource.close()
  }
}


using(io.Source.fromFile(filename)) { source =>
  for (line <- source.getLines) {
    println(line)
  }
}
