/**
  * Adding a trait to an Object instance
  *
  */

class David

trait Angry {
  println("You don't like me")
}

val hulk = new David with Angry

trait Debugger {
  def log(message: String) {
    println(message)
  }
}

class Child
val problemChild = new Child with Debugger

