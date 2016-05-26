trait Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal
case object Woodpecker extends Animal

def determineType(x: Animal): String = x match {
  case Dog(name) => "Got a Dog, name = " + name
  case _:Cat => "Got a Cat (ignoring the name)"
  case Woodpecker => "That was a Woodpecker"
  case _ => "That was something else"
}

determineType(new Dog("Rocky"))
determineType(new Cat("Rusty the Cat"))
determineType(Woodpecker)


val i = 0

i match {
  case a if 0 to 9 contains a => println("0-9 range: " + a)
  case b if 10 to 19 contains b => println("10-19 range: " + b)
  case c if 20 to 29 contains c => println("20-29 range: " + c)
}