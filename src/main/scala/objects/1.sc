/**
  * Casting
  * `asInstanceOf` method defined in the ScalaAny therefor
  * it is available in all objects
  *
  */
/*
val recognizer = cm.lookup("recognizer")
                      .asInstanceOf[Recognizer]

*/

val a = 10
val b = a.asInstanceOf[Long]
val c = a.asInstanceOf[Byte]

//check the type of vals
val objects = Array("a", 1)
val arrayObject  = objects.asInstanceOf[Array[Object]]




