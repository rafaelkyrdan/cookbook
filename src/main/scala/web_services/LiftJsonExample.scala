package web_services


import scala.collection.mutable._
import net.liftweb.json._
import net.liftweb.json.Serialization.write

case class Person(name: String, address: Address2)

case class Address2(city: String, state: String)


object LiftJsonExample extends App {


  val p = Person("Alvin Alexander", Address2("Talkeetna", "AK"))
  // create a JSON string from the Person, then print it
  implicit val formats = DefaultFormats
  val jsonString = write(p)
  println(jsonString)

}
