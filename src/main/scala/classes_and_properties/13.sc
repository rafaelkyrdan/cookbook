/**
  * When you define an abstract field in an abstract class
  * or trait, the Scala compiler does not create a
  * field in the resulting code; it only generates
  * the methods(setter and getter) that correspond to the val or var field
  *
  * Because of this, when you provide concrete
  * values for these fields in your concrete classes,
  * you must again define your fields to be val or var.
  */


abstract class Pet(name: String) {
  val greeting: String
  var age: Int

  def sayHello {
    println(greeting)
  }

  override def toString = s"I say $greeting, and I'm $age"
}

class Dog(name: String) extends Pet(name) {
  val greeting = "Woof"
  var age = 2
}

class Cat(name: String) extends Pet(name) {
  val greeting = "Meow"
  var age = 5
}

val dog = new Dog("Fido")
val cat = new Cat("Morris")
dog.sayHello
cat.sayHello


abstract class Animal {
  final val greeting = "Hello"
}

class Dog2 extends Animal {
  //val greeting = "Woof" // this line won't compile
}
