/**
  * Sorting
  *
  */

List(10, 5, 8, 1, 7).sorted
List("banana", "pear", "apple", "orange").sorted
List(10, 5, 8, 1, 7).sortWith(_ >= _)
List(10, 5, 8, 1, 7).sortWith(_ <= _)
List("banana", "pear", "apple", "orange").sortWith(_ < _)
List("banana", "pear", "apple", "orange").sortWith(_.length > _.length)
List("banana", "pear", "apple", "orange").sortWith(_.length < _.length)

class Person(var name: String) {
  override def toString = name
}

val ty = new Person("Tyler")
val al = new Person("Al")
val paul = new Person("Paul")
val dudes = List(ty, al, paul)

dudes.sortWith(_.name > _.name)
dudes.sortWith(_.name < _.name)

class Person2(var name: String) extends Ordered[Person2] {
  override def toString = name

  // return 0 if the same, negative if this < that, positive if this > that
  def compare(that: Person2) = {
    if (this.name == that.name) {
      0
    } else if (this.name > that.name) {
      1
    } else {
      -1
    }

  }
}

val ty2 = new Person2("Tyler")
val al2 = new Person2("Al")
val paul2 = new Person2("Paul")
val dudes2 = List(ty2, al2, paul2).sorted
if (al2 > ty2) println("Al") else println("Tyler")




