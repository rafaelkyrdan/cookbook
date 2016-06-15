/**
  * Covariant example
  *
  */

trait Animal {
  def speak
}

class Dog(var name: String) extends Animal {
  def speak {
    println("Dog says woof")
  }
}

class SuperDog(name: String) extends Dog(name) {
  override def speak {
    println("I'm a SuperDog")
  }
}

def makeDogsSpeak(dogs: Seq[Dog]) {
  dogs.foreach(_.speak)
}

val dogs = Seq(new Dog("Fido"), new Dog("Tanner"))
makeDogsSpeak(dogs)

val superDogs = Seq(new SuperDog("Wonder Dog"), new SuperDog("Scooby"))
makeDogsSpeak(superDogs)