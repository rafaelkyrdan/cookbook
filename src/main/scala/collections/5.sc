/**
  * Vector is very fast
  *
  */

var v = Vector[Int]()
for {
  i <- 1 to 50000
} v = v :+ i

v


//Access elements efficiently by index
val v1 = Vector("a", "b", "c")
v1(1)

//Vector is immutable collection
//so just create a new one when you need to add an element
val a = Vector(1, 2, 3)
val b = a ++ b
val c = b.updated(0, "x")
