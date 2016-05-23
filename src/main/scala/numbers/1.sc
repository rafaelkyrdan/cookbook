/**
  * Converting
  */

"100".toInt
"1".toLong
"1".toShort
"1".toByte

val b = BigInt("1")
val c = BigDecimal("3.14159")

/**
  * Changing the base
  */
Integer.parseInt("1", 2)
Integer.parseInt("10", 2)
Integer.parseInt("100", 2)


/**
  * Implicit Converting
  * don't forget about restrictions for implicit
  */

//implicit class StringToInt(s: String) {
//  def toInt(radix: Int) = Integer.parseInt(s, radix)
//}
//
//"1".toInt(2)

/**
  * Explicit Converting
  *
  * @param s
  * @return
  */

def toInt(s: String): Option[Int] = {
  try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => None
  }
}

println(toInt("1").getOrElse(0))
println(toInt("a").getOrElse(0))
