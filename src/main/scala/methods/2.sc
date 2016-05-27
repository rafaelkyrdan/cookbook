/**
  * Invoking the superclass' methods
  */

class FourLeggedAnimal {
  def walk {
    println("I'm walking")
  }

  def run {
    println("I'm running")
  }
}

class Dog extends FourLeggedAnimal {
  def walkThenRun {
    super.walk
    super.run
  }
}

val suka = new Dog
suka.walkThenRun


//controlling which trait you call
trait Human {
  def hello = "the Human trait"
}

trait Mother extends Human {
  override def hello = "Mother"
}

trait Father extends Human {
  override def hello = "Father"
}

class Child extends Human with Mother with Father {
  def printSuper = super.hello

  def printMother = super[Mother].hello

  def printFather = super[Father].hello

  def printHuman = super[Human].hello
}

val c = new Child
c.printSuper
c.printMother
c.printHuman
c.printFather