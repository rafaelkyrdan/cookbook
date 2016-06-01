/**
  * Sub-sequence
  *
  */

val x = (1 to 10).toArray
val y = x.drop(3)
val z = x.dropWhile(_ < 6)
val y1 = x.dropRight(3)
val z1 = x.take(3)
val peeps = List("John", "Mary", "Jane", "Fred")
peeps.slice(1,3)


