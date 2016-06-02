/**
  * Merging collections
  *
  */

val a = collection.mutable.ArrayBuffer(1,2,3)
a ++= Seq(4,5)

val b = Array(1,2,3)
val c = Array(4,5,6)
val d = b ++ c
a.intersect(d)
a.union(c)
d diff a
a diff d
