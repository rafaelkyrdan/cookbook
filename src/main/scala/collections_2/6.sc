/**
  * Immutable map
  *
  */

val a = Map("AL" -> "Alabama")
val b = a + ("AK" -> "Alaska")
val c = b + ("AR" -> "Arkansas", "AZ" -> "Arizona")
val d = c + ("AR" -> "banana")
val e  = d - "AR"


/**
  * Immutable map as var
  *
  */

var x = Map("AL" -> "Alabama")
x += ("AK" -> "Alaska")
x
x += ("AR" -> "Arkansas", "AZ" -> "Arizona")
x
x += ("AR" -> "banana")
x -= "AR"
x