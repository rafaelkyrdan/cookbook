/**
  * Defining a private primary constructor
  *
  */

class Human private(name: String)

val p = new Human("rafael")

class Brain private {
  override def toString = "this is brain"
}

object Brain {
  val brain = new Brain
  def getInstance = brain

  // all methods in the companion object are static

}

val brain = new Brain
val brain2 = Brain.getInstance



