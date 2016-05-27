/**
  * Method which act as accessor
  * should be defined without parentheses
  */

class Pizza {
  // no parentheses after crustSize
  def crustSize = 12
}

val p = new Pizza()
//p.crustSize()// won't compile
p.crustSize


//varargs example
def printAll(str:String*): Unit ={
  str.foreach(println)
}

printAll("rafael", "daniel", "ted")

//use a sequence(List, Vector, Array) as vararg parameter
val fruits = "apple" :: "orange" :: "bannana" :: Nil
printAll(fruits:_*)






