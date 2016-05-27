/**
  * Calling auxilary constructors while extending super class
  */
class Animal(var name: String, var age: Int) {
  def this(name: String) {
    this(name, 0)
  }

  override def toString = s"$name is $age years old"
}

// calls the Animal one-arg constructor
class Dog(name: String) extends Animal(name) {
  println("Dog constructor called")
}

// call the two-arg constructor
class Cat(name: String) extends Animal(name, 0) {
  println("Cat constructor called")
}