import scala.collection.parallel.immutable.ParVector

/**
  * Parallel collections
  *
  */

val v = Vector.range(0,10)
v.foreach(println)

//always diff result
v.par.foreach(println)
v.par.foreach(println)

v.par.foreach{e => println(e); Thread.sleep(50)}

val v1 = ParVector.range(0, 10)
v1.foreach{ e => Thread.sleep(100); print(e) }


