/**
  * Determining the class of an object
  *
  */

def printAll(numbers: Int*) {
  println(s" Class is = ${numbers.getClass}")
}

printAll()
printAll(1)
printAll(1, 3, 3)

