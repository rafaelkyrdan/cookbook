/**
  * Sub-sets(grouping)
  *
  */

val x = List(15, 10, 5, 8, 20, 12)
val y = x.groupBy(_ > 10)
val z = x.partition(_ > 10)
val y1 = x.span(_ < 20)
val z1 = x.splitAt(2)

val nums = (1 to 5).toArray
nums.sliding(2).toList
nums.sliding(2, 2).toList
nums.sliding(2,3).toList

val listOfTuple2s = List((1,2), ('a', 'b'))
listOfTuple2s.unzip

val couples = List(("Kim", "Al"), ("Julia", "Terry"))
val (women, men) = couples.unzip

val couples2 = women zip men
