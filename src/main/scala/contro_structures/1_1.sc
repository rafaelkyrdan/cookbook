/**
  * Compile example with:
  * scalac -Xprint:parse Main.scala
  * scalac -Xprint:all Main.scala
  * to see how scala compiler translates for loops
  */

class Main {
  for (i <- 1 to 10) println(i)
}


