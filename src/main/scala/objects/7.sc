class Person {
  var name: String = _
}

object Person {
  def apply(name: String): Person = {
    var p = new Person
    p.name = name
    p
  }
}

val dawn = Person("Dawn")
val arr = Array(Person("Rafael"), Person("Dawn"))
val r = new Person()
r.name = "Rafael"


case class Employer(val name:String)
Employer("Rafael")
