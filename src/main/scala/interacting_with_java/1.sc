/**
  *
  *
  */

var list = new java.util.ArrayList[Int]()
list.add(1)
list.add(2)
list
//doesn't work
//list.foreach(print)

import scala.collection.JavaConversions._

//now it works
list.foreach(println)
