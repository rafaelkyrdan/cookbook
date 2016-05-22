/**
  * Intro
  * Scala String has both string and collections features.
  */

val s = "hello world"
println(s.getClass.getName)

println(s.length)

s.foreach(println)

for {
  c <- s
} println(c)

s.getBytes().foreach(println)

s.filter(_ != 'l')

"scala".drop(2).take(2).capitalize

"scala".slice(2, 4).capitalize
