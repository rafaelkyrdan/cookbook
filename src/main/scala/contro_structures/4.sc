/**
  * Break and breakable are methods
  * Break throw an exception and breakable catch it
  *
  * But it doesn't look naturally in the scala
  *
  */

import util.control.Breaks._

println("\n=== BREAK EXAMPLE ===")

breakable {
  for (i <- 1 to 10) {
    println(i)
    if (i > 4) break // break out of the for loop
  }
}

println("\n=== CONTINUE EXAMPLE ===")
val searchMe = "peter piper picked a peck of pickled peppers"

var numPs = 0
for (i <- 0 until searchMe.length) {
  breakable {
    if (searchMe.charAt(i) != 'p') {
      break // break out of the 'breakable', continue the outside loop } else {
      numPs += 1 }
  }
}

println("Found " + numPs + " p's in the string.")

println("\n=== CONTINUE EXAMPLE ===")
numPs = 0

for (i <- 0 until searchMe.length) {
  breakable {
    if (searchMe.charAt(i) != 'p') {
      break // break out of the 'breakable', continue the outside loop
    } else {
      numPs += 1
    }
  }
}

println("Found " + numPs + " p's in the string.")

//The short example which does the same as Continue example
val count = searchMe.count(_ == 'p')

