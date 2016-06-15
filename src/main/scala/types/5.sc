/**
  *
  */

def add[A](x: A, y: A)(implicit numeric: Numeric[A]): A = numeric.plus(x, y)
println(add(1, 1))
println(add(1.0, 1.5))
println(add(1, 1.5F))

trait Animal
final case class Dog(name: String) extends Animal
final case class Cat(name: String) extends Animal

trait HumanLike[A] {
  def speak(speaker: A): Unit
}

object HumanLike {

  // implement the behavior for each desired type. in this case, // only for a Dog.
  implicit object DogIsHumanLike extends HumanLike[Dog] {
    def speak(dog: Dog) {
      println(s"I'm a Dog, my name is ${dog.name}")
    }
  }

}

// create a method to make an animal speak
def makeHumanLikeThingSpeak[A](animal: A)(implicit humanLike: HumanLike[A]) {
  humanLike.speak(animal)
}

// because HumanLike implemented this for a Dog, it will work
makeHumanLikeThingSpeak(Dog("Rover"))
