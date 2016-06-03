/**
  * Queue
  *
  */

import scala.collection.mutable.Queue
var ints = Queue[Int]()
var fruits = Queue[String]()
fruits += "apple"
fruits += ("banana", "kiwi")
fruits ++= List("cherry", "coconut")
val first = fruits.dequeue()
fruits
val second = fruits.dequeue()
fruits
fruits.dequeueFirst(_.startsWith("k"))
fruits
fruits.dequeueAll(_.length > 6)
fruits


val q = Queue(1, 2, 3)

