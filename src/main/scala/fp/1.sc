/**
  * Functional literal
  *
  */

val x = List.range(1, 10)
val evens =   x.filter( (y:Int) => y % 2 == 0)


/**
  * As a variable
  *
  */

val double = (x:Int) => x * 2
double(2)
double(4)
val list = List.range(1, 5)
list.map(double)
val add: (Int, Int) => Int = (x, y) => x + y

/**
  * Assigning function to a variable
  * and partially applied functions
  */

val c = scala.math.cos _
c(0)

val p = scala.math.pow(_, _)
p(scala.math.Pi, 2)


/*
Simple function parameter
 */

def executeFunction(callback:() => Unit) {
  callback()
}

val sayHello = () => {println("Hello")}
executeFunction(sayHello)

def exec(callback:Int => Unit) = {
  callback(1)
}

val plusOne:Int => Unit = (x) => println(x + 1)
val plusOne_1 = (x:Int) => println(x + 1)
exec(plusOne)
exec(plusOne_1)