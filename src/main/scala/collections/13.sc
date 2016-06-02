/**
  * Reduce, fold and scan
  *
  */

val a = Array(12, 6, 15, 2, 20, 9)
a.reduceLeft(_ + _)
a.reduceLeft {
  (a, b) => if (a > b) a else b
}

val findMax = (x: Int, y: Int) => {
  val winner = x max y
  println(s"compared $x to $y, $winner was larger")
  winner
}

a.reduceLeft(findMax)

a.foldLeft(19)(_ + _)

val product = (x: Int, y: Int) => {
  val result = x * y
  println(s"multiplied $x by $y to yield $result")
  result
}

val b = Array(1, 2, 3)
b.scanLeft(10)(product)

val findMax2 = (x: Int, y: Int) => {
  Thread.sleep(10)
  val winner = x max y
  println(s"compared $x to $y, $winner was larger")
  winner
}

val c = Array.range(0, 50)
c.par.reduce(findMax2)





