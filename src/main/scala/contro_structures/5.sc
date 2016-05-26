import scala.annotation.switch

/**
  * Ternary operator;
  * Match expressions;
  *
  */

def abs(x: Int) = if (x > 0) x else -x
def max(x: Int, y: Int) = if (x > y) x else y

val i = 0

@switch
val months = i match {
  case 1 => "January"
  case 2 => "February"
  case 3 => "March"
  case 4 => "April"
  case 5 => "May"
  case 6 => "June"
  case 7 => "July"
  case 8 => "August"
  case 9 => "September"
  case 10 => "October"
  case 11 => "November"
  case 12 => "December"
  case _ => "Invalid month"
}

val j = 5

j match {
  case 1 | 3 | 5 | 7 | 9 => println("odd")
  case 2 | 4 | 6 | 8 | 10 => println("even")
}

val cmd = "stop"

cmd match {
  case "start" | "go" => println("starting")
  case "stop" | "quit" | "exit" => println("stopping")
  case _ => println("doing nothing")
}

def isTrue(a: Any):Boolean = a match {
  case 0 | "" => false
  case _ => true
}










