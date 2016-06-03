/**
  * ArrayBuffer and Array
  *
  */

import scala.collection.mutable.ArrayBuffer
var characters = new ArrayBuffer[String]
characters += "Ben"
characters += "Dick"
characters += ("Harry", "Wizard")

val x = ArrayBuffer('a', 'b', 'c', 'd', 'e')
x -= 'a'
x -= ('b', 'c')
x --= Seq('c')


val fruits = Array("cherry", "apple", "banana")
scala.util.Sorting.quickSort(fruits)

/**
  * Multidimensional array
  *
  */

val rows = 2
val cols = 3
val a = Array.ofDim[String](rows, cols)
a(0)(0) = "a"
a(0)(1) = "b"
a(0)(2) = "c"
a(1)(0) = "d"
a(1)(1) = "e"
a(1)(2) = "f"

val first = a(0)(0)
for {
  i <- 0 until(rows)
  j <- 0 until(cols)
} println(s" $i === $j")







