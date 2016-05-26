/**
  *
  */

val x = List(1, 2, 3)
val y = 1 :: 2 :: 3 :: Nil

def listToString(list: List[String]): String = list match {
  case s :: rest => s + " " + listToString(rest)
  case Nil => ""
}

