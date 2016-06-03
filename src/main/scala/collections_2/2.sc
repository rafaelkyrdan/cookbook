/**
  * Right Associativity
  * Methods which end with ":" are right associativity
  * 
  */

class Printer {
  def >>(i: Int) { println(s"$i") }
  def >>:(i: Int) { println(s"$i") }
}

val f1 = new Printer
f1 >> 42
42 >>: f1