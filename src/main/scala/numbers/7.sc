/**
  * Generating random numbers
  *
  * */

val r = scala.util.Random

r.nextBoolean()
r.nextInt()

r.nextPrintableChar
r.nextPrintableChar

r.nextFloat()
r.nextFloat() * 100

r.nextInt(100)
val r1 = new scala.util.Random(100)

r.setSeed(100L)

/**
  * Random range
  *
  */

val range = 0 to r.nextInt(100)
val range2 = for {
  x <- 0 to r.nextInt(10)
} yield x * 2

val range3 = for {
  x <- 0 to r.nextInt(10)
} yield r.nextPrintableChar()

range3.foreach(println)

val range4 = for{
  x <- 0 to 5
} yield r.nextPrintableChar()

range4.foreach(println)

/**
  * Generate all alpha characters
  */
  
val chars = ('a' to 'z') ++ ('A' to 'Z')


