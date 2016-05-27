/**
  * Handling constructor parameters
  * when extending the base class
  *
  * Don't use var/val for inherited fields
  *
  */

class Person(var name: String, var address: Address) {
  override def toString = if (address == null) name else s"$name @ $address"
}

case class Address(var city: String, var street: String)

class Employee(name: String, address: Address, var age: Int)
    extends Person (name:String, address:Address) {
  override def toString = if (address == null) name else s"$name @ $address"
}

val me = new Employee("Rafael", Address("Kyiv", "Williams"), 34)

me.name
me.age
me.address
