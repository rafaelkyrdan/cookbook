/**
  * Creating partial functions
  *
  */

val divide = new PartialFunction[Int, Int] {
  def apply(x: Int) = 42 / x

  def isDefinedAt(x: Int) = x != 0
}

if (divide.isDefinedAt(1)) divide(1)
divide.isDefinedAt(0)


val divide2: PartialFunction[Int, Int] = {
  case x: Int if x != 0 => 42 / x
}

divide2.isDefinedAt(1)
divide2.isDefinedAt(0)


// converts 1 to "one", etc., up to 5
val convertLowNumToString = new PartialFunction[Int, String] {
  val nums = Array("one", "two", "three", "four", "five")

  def apply(i: Int) = nums(i - 1)

  def isDefinedAt(i: Int) = i > 0 && i < 6
}

// converts 1 to "one", etc., up to 5
val convert1to5 = new PartialFunction[Int, String] {
  val nums = Array("one", "two", "three", "four", "five")
  def apply(i: Int) = nums(i - 1)

  def isDefinedAt(i: Int) = i > 0 && i < 6
}
// converts 6 to "six", etc., up to 10
val convert6to10 = new PartialFunction[Int, String] {
  val nums = Array("six", "seven", "eight", "nine", "ten")
  def apply(i: Int) = nums(i - 6)

  def isDefinedAt(i: Int) = i > 5 && i < 11
}

val handle1to10 = convert1to5 orElse convert6to10
handle1to10(8)
handle1to10(3)

List(0,1,2) collect { divide2 }


