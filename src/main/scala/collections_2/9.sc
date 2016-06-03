/**
  * Set
  *
  */

var set = scala.collection.mutable.Set[Int]()
set += 1
set +=(2, 3)
set += 2
set ++= Vector(4,5)
set.add(6)
set.add(5)

set -= 1
set -= (2,3)
set --= Array(4,5)

val s1 = Set(2,3)
val s2 = s1 + 4
val s3 = s2 + (1,5)
val s4 = s3 ++ List(6,7)

val s5 = s2 - 1
val s6 = s3 - (2,5)
val s7 = s4 -- List(3,7)


var x = Set(1,2,3)
x += 4




