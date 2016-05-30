/**
  * Partially applied functions
  *
  */


val sum = (x:Int, y:Int, z:Int) => x + y + z
val f = sum(1, 2, _:Int)
f(3)

/**
  * Return a function
  *
  */

def saySomething(prefix:String) = (s:String) => prefix + s
val sayHello = saySomething("Hello, ")
sayHello("Rafael")
