import scala.collection.mutable.ArrayBuffer

/*
  Invariant example
 */

trait Animal {
  def speak
}

class Dog(var name: String) extends Animal {
  def speak {
    println("woof")
  }

  override def toString = name
}

class SuperDog(name: String) extends Dog(name) {
  def useSuperPower {
    println("Using my superpower!")
  }
}

val fido = new Dog("Fido")
val wonderDog = new SuperDog("Wonder Dog")
val shaggy = new SuperDog("Shaggy")

// we can add to collection subtypes
val dogs = ArrayBuffer[Dog]()
dogs += fido
dogs += wonderDog
dogs += shaggy

def makeDogsSpeak(dogs: ArrayBuffer[Dog]) {
  dogs.foreach(_.speak)
}

makeDogsSpeak(dogs)

val superDogs = ArrayBuffer[SuperDog]()
superDogs += shaggy
superDogs += wonderDog

//won't compile
//makeDogsSpeak(superDogs)
