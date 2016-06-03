/**
  * List
  *
  */

1 :: 2 :: 3 :: Nil
List(1, 2.0, 33D, 4000L)
List[Number](1, 2.0, 33D, 4000L)
List.fill(3)("foo")
List.tabulate(5)(n => n * n)
"foot".toList
val x = List(2)
val y = 1 :: x
val z = 0 :: y
val a = List(1,2,3)
val b = List(4,5,6)
val c = a ++ b
val d = a ::: b
val e = List.concat(a, b)

/**
  * Mutable list
  *
  */

import scala.collection.mutable.ListBuffer

val fruits = new ListBuffer[String]
fruits += "apple"
fruits += "banana"
fruits += "orange"
fruits += "lemon"
fruits +=("Strawberry", "Kiwi", "Pineapple")
val xx = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9)
xx -= 5
xx -=(2, 3)
xx.remove(0)
xx.remove(1, 3)
xx
