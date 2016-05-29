/**
  * Factory Method
  */

trait Animal {
  def speak
}

object Animal {

  private class Dog extends Animal {
    override def speak {
      println("woof")
    }
  }

  private class Cat extends Animal {
    override def speak {
      println("meow")
    }
  }

  // the factory method
  def apply(s: String): Animal = {
    if (s == "dog") new Dog
    else new Cat
  }
}

val cat = Animal("cat")
val dog = Animal("dog")

cat.speak
dog.speak
