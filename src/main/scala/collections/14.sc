/**
  * Remove duplicates
  *
  */


val x = Vector(1, 1, 2, 3, 3, 4)
val y = x.distinct
val s = x.toSet

class Person(firstName: String, lastName: String) {
  override def toString = s"$firstName $lastName"

  def canEqual(a: Any) = a.isInstanceOf[Person]

  override def equals(that: Any): Boolean = that match {
    case that: Person => that.canEqual(this) && this.hashCode == that.hashCode
    case _ => false
  }

  override def hashCode: Int = {
    val prime = 31
    var result = 1
    result = prime * result + lastName.hashCode;
    result = prime * result + (if (firstName == null) 0 else firstName.hashCode)
    return result
  }
}

object Person {
  def apply(firstName: String, lastName: String) =
    new Person(firstName, lastName)
}

val dale1 = new Person("Dale", "Cooper")
val dale2 = new Person("Dale", "Cooper")
val ed = new Person("Ed", "Hurley")
val list = List(dale1, dale2, ed)
val uniques = list.distinct