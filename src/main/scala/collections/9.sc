/**
  * Iterator
  * It is not common approach in Scala
  *
  */


val it = Iterator(1,2,3)

//works only first time
it.foreach(println)

//won't work second time
//because has been exhausted
it.foreach(println)
