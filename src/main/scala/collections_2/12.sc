/**
  * Stack
  *
  */

import scala.collection.mutable.Stack
var ints = Stack[Int]()
var fruits = Stack[String]()
fruits.push("apple")
fruits.push("banana")
fruits.push("coconut", "orange", "pineapple")

val first = fruits.pop()
fruits.size
fruits.isEmpty
