/**
  * Primary constructor
  */

class Person(var firstName: String, var lastName: String) {
  println("the constructor begins")
  // some class fields
  private val HOME = System.getProperty("user.home")
  var age = 0
  // some methods
  override def toString = s"$firstName $lastName is $age years old"
  def printHome { println(s"HOME = $HOME") }
  def printFullName { println(this) } // uses toString
  printHome
  printFullName
  println("still in the constructor")
}

val p = new Person("Rafael", "Kyrdan")
p.firstName
p.lastName

// Because the fields, constructor arguments, are
// mutable scala generates accessors and mutator methods for them.
p.firstName = "Daniel"
p.lastName = "Lapuchio"

// the same with field
p.age = 24

//the field `HOME` declared as private val, so it cant be accessed
//and changed
