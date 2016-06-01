/**
  * Transforming collections
  *
  */

val a = Array(1, 2, 3, 4, 5)
for (e <- a) yield e * 2
for (e <- a) yield e % 2

val fruits = Vector("apple", "banana", "lime", "orange")
for {f <- fruits} yield (f, f.length)

val names = Array("Fred", "Joe", "Jonathan")
val lengths = names.map(_.length)

/**
  * Flattening
  *
  */

val lol = List(List(1, 2), List(3, 4))
lol.flatten
val b = Array(Array(1, 2), Array(3, 4))
b.flatten

val couples = List(List("kim", "al"), List("julia", "terry"))
val people = couples.flatten.map(_.capitalize).sorted

val list = List("Hello", "world")
list.flatten

val x = Vector(Some(1), None, Some(3), None)
x.flatten


//flatMap
val bag = List("1", "2", "three", "4", "one hundred seventy five")
def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  } catch {
    case e: Exception => None
  }
}

bag.flatMap(toInt).sum
bag.flatMap(toInt).filter( _ > 1)
bag.flatMap(toInt).takeWhile( _ < 4)
bag.flatMap(toInt).partition(_ > 3)
