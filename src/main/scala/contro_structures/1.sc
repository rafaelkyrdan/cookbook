/**
  *
  */

val a = List("apple", "banana", "orange")

a.foreach(println)

for {
  x <- a
} println(x.toUpperCase)


val newA = for {
  x <- a
} yield x.toLowerCase

for (i <- 0 until a.length) {
  println(s"$i - ${a(i)}")
}

for ((i, j) <- a.zipWithIndex) {
  println(s"$i - $j")
}

var rangeWithGuard = for {
  x <- 0 to 10
  if x % 2 == 0
} yield x

val names = Map("fname" -> "Rafael", "lname" -> "Kyrdan")

for {
  (k, v) <- names
} println(s"$k - $v")







