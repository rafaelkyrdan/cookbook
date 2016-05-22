/**
  * In scala, == method first check on null values
  * and then, calls the equals method on the first object.
  *
  */

val s1 = "Hello"
val s2 = "Hello"
val s3 = "H" + "ello"

s1 == s2
s1 == s3

val s4: String = null
s1 == s4

val s5 = "hello"
s1.toUpperCase == s5.toUpperCase

val a = "Maria"
val b = "maria"
a.equalsIgnoreCase(b)

