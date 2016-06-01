/**
  * Declaring type when creating the collection
  */

val doubleList = List(1, 2.0, 33D, 400L)
val numberList = List[Number](1, 2.0, 33D, 400L)
val anyValList = List[AnyVal](1, 2.0, 33D, 400L)

trait Animal

trait FurryAnimal extends Animal

case class Dog(name: String) extends Animal

case class Cat(name: String) extends Animal

//check the type of x and xAnimal
val x = Array(Dog("Fido"), Cat("Felix"))
val xAnimal = Array[Animal](Dog("Fido"), Cat("Felix"))


