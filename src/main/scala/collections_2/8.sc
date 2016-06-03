/**
  * Testing for existence
  *
  */

val states = Map("AK" -> "Alaska", "IL" -> "Illinois", "KY" -> "Kentucky")
if (states.contains("FOO"))
  println("Found foo")
else
  println("No foo")

states.valuesIterator.exists(_.contains("ucky"))
states.valuesIterator.exists(_.contains("lucky"))

/**
  * Filtering
  *
  */

var x = collection.mutable.Map(1 -> "a", 2 -> "b", 3 -> "c")
x.retain((k, v) => k > 1)

val x1 = Map(1 -> "a", 2 -> "b", 3 -> "c")
val y = x1.filterKeys(_ > 2)

x.filter((x) => x._1 > 1)
x1.filter((x) => x._1 > 1)

/**
  * Sorting
  *
  */

val grades = Map("Kim" -> 90, "Al" -> 85,
  "Melissa" -> 95, "Emily" -> 91,
  "Hannah" -> 92)


import scala.collection.immutable.ListMap
ListMap(grades.toSeq.sortBy(_._1):_*)

//_* - varargs parameter

def printAll(strings: String*) {
  strings.foreach(println)
}
val fruits = List("apple", "banana", "cherry")
//doesn't work
//printAll(fruits)
//it works
printAll(fruits:_*)

grades.max
grades.min  


