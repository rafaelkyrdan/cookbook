class Person(name: String, age: Int) {
  def canEqual(a: Any) = a.isInstanceOf[Person]

  override def equals(that: Any): Boolean = that match {
    case that: Person => that.canEqual(this) && this.hashCode == that.hashCode
    case _ => false
  }

  override def hashCode: Int = {
    val prime = 31
    var result = 1
    result = prime * result + age;
    result = prime * result + (if (name == null) 0 else name.hashCode)
    return result
  }
}