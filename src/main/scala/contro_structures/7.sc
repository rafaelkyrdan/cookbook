/**
  *
  */
case class Person(firstName: String, lastName: String)


def matchType(x: Any): String = x match {
  //case x: List(1, _*) => s"$x" // doesn't compile
  case x @ List(1, _*) => s"$x"
  //case Some(_) => "got a Some" // works, but can't access the Some
  // case Some(x) => s"$x" // works, returns "foo"
  case x @ Some(_) => s"$x" // works, returns "Some(foo)"
  case p @ Person(first, "Doe") => s"$p" // works, returns "Person(John,Doe)"
}

matchType(List(1,2,3))
matchType(Some("foo"))
matchType(Person("John", "Doe"))



