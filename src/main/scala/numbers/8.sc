/**
  * Range, list and array
  */

val range = 0 to 10
val range2 = 0 to 10 by 2
val range3 = 0 to 10 by 3

for {
  x <- 0 to 5
} println(x)

for {
  x <- 0 until 5
} println(x)


range toList
val x = (1 to 10).toList

range2 toArray
val x1 = (1 until 10).toArray






