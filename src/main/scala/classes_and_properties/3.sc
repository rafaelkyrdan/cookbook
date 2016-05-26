/**
  * Auxiliary constructors
  */

object Pizza {
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "THIN"
}

// primary constructor
class Pizza (var crustSize: Int, var crustType: String) {

  // one-arg auxiliary constructor
  def this(crustSize: Int) {
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }

  // one-arg auxiliary constructor
  def this(crustType: String) {
    this(Pizza.DEFAULT_CRUST_SIZE, crustType)
  }

  // zero-arg auxiliary constructor
  def this() {
    this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  }

  override def toString = s"A $crustSize inch pizza with a $crustType crust"
}

val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
val p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
val p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
val p4 = new Pizza

// Auxiliary constructors for case class

case class Person2 (var name: String, var age: Int)

// the companion object
object Person2 {
  def apply() = new Person2("<no name>", 0)
  def apply(name: String) = new Person2(name, 0)
}

val a = Person2()
val b = Person2("Rafael")
val c = Person2("Rafael", 34)

//getters
a.name
a.age
b.age

//setters
a.name = "Daniel"
b.age = 33







