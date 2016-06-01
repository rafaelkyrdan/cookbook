import scala.collection.mutable.ArrayBuffer

/**
  * ArrayBuffer - is an indexed sequential mutable
  * collection.
  *
  * ListBuffer - is linear sequential collection.
  *
  */

var fruits = ArrayBuffer[String]()
var ints = ArrayBuffer[Int]()
val nums = ArrayBuffer(1, 2, 3)
nums += 4
nums +=(5, 6)
nums ++= List(7,8)





