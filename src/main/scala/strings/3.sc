/**
  * The split method is overloaded some
  * versions come from Java String and some from
  * Scala StringLike class
  */

"hello world".split(" ")

"hello world".split(' ')

"hello world".split(" ").foreach(println)


val s = "eggs, milk, butter, bread"
s.split(",").map(_.trim)


"Hello World, this is AI".split("\\s+").map(_.toUpperCase.trim)




