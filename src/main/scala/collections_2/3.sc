/**
  * Stream
  *
  */

val stream = 1 #:: 2 #:: 3 #:: Stream.empty
val stream2 = (1 to 100000000).toStream

//lazy methods
stream2.take(3)
stream2.filter(_ < 200)

//strict not lazy methods
stream.max
stream.size
stream.sum


/**
  * Array
  */

val x = Array.fill(3)(3)
val y = Array.tabulate(5)(n => n * n)
val a = Array(1, 2, 3)
a(0)
a(1) = 4
a(2) = 5


/**
  * don't do this
  *
  */

//var fruits:Array[String] = _
//fruits = Array("apple", "banana")

