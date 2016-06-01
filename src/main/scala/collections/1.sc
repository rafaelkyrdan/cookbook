import scala.collection.LinearSeq

/**
  * Hierarchy
  */

/*
Simplified version of hierarchy

Traversable
|
|
Iterable
|
|
Seq ---- Set ----- Map
|
|
IndexedSeq ---- LinearSeq ----- Buffer

 */

/*

Traversable trait lets you to traverse the collection
in terms of `foreach` method

Iterable trait defines the iterator

 */


/*

IndexedSeq indicates that random access is efficient
such as aff(4)

LinearSeq indicates that collection can be efficiently
split on head and tail components

 */

//Vector
val x = IndexedSeq(1,2,3)
//List
val y = LinearSeq(1,2,3)



