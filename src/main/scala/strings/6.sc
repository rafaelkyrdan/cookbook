/**
  * In order to create a RegExp invoke the .r method on string
  *
  */

val numPattern = "[0-9]+".r
val address = "03189 Kyiv Williams street 19"

val match1 = numPattern.findFirstIn(address)
val matches = numPattern.findAllIn(address)

matches.foreach(println)

/**
  * Create a RegExp instance
  */

import scala.util.matching.Regex

val numPattern2 = new Regex("[0-9]+")
val address2 = "Williams street 19 apartment 177"
val match2 = numPattern2.findFirstIn(address2)

val noaddress = "No address given"
val result = numPattern2.findFirstIn(noaddress).getOrElse("no address")


