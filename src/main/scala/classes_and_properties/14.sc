/*
Scala generates a lot of boilerplate code
for case classes
accessor and mutator methods,
unapply, toString, equals, and hashCode methods and etc.
 */

case class Person(name: String, relation: String)
val emily = Person("Emily", "niece")
emily.name

case class Company (var name: String)
val c = Company("Mat-Su Valley Programming")
c.name
c.name = "New company name"

emily match { case Person(n, r) => println(n, r) }

// equals and hashcode generated
val hannah = Person("Hannah", "niece")
emily == hannah

// copy method for creating clones
case class Employee(name: String, loc: String, role: String)
val fred = Employee("Fred", "Anchorage", "Salesman")
val joe = fred.copy(name="Joe", role="Mechanic")


