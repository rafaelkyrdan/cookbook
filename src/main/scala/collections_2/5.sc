/**
  *
  */

import scala.collection.SortedMap


val grades = SortedMap("Kim" -> 90,
  "Al" -> 85,
  "Melissa" -> 95,
  "Emily" -> 91,
  "Hannah" -> 92)

import scala.collection.mutable.LinkedHashMap
//remember the insertion order
var states = LinkedHashMap("IL" -> "Illinois")
states += ("KY" -> "Kentucky")
states += ("TX" -> "Texas")
states("AK") = "Alaska"
states

states += ("Al" -> "Alabama")
states

states += ("Ar" -> "Arkansas", "Az" -> "Arizona")
states

states ++= List("CA" -> "California", "CO" -> "Colorado")
states