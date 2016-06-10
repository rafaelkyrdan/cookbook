/**
  *
  */


import scala.annotation.varargs

class Printer {
  @varargs
  def printAll(args: String*) {
    args.foreach(print)
    println
  }
}