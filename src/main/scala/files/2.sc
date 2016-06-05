/**
  * Writing file
  *
  */


import java.io._
val pw = new PrintWriter(new File("/Users/rafaelkyrdan/projects/cookbook/data/hello.txt" ))
pw.write("Hello, world")
pw.close

val file = new File("/Users/rafaelkyrdan/projects/cookbook/data/hello2.txt")
val bw = new BufferedWriter(new FileWriter(file))
bw.write("some text")
bw.close()
