
/**
  * Add your own methods to String
  * Scala doesn't allow to put definitions
  * of implicit classes on top level so
  * wrap up it in the object.
  * It is recommended to annotate return type of implicit method definitions
  *
  */

implicit class StringImprovements(s: String) {
  def increment: String = s.map(c => (c + 1).toChar)

  def decrement: String = s.map(c => (c - 1).toChar)

  def hideAll: String = s.replaceAll(".", "*")

  def plusOne: Int = s.toInt + 1

  def asBoolean: Boolean = s match {
    case "0" | "zero" | "" | " " => false
    case _ => true
  }
}

val result = "HAL".increment

/**
  * Before scala 2.10
  *
  */

//class StringImprovements(val s: String) {
//  def increment = s.map(c => (c + 1).toChar)
//}
//
//implicit def stringToString(s:String) = new StringImprovements(s)





