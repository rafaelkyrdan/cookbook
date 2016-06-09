package web_services


import net.liftweb.json.JsonAST
import net.liftweb.json.JsonAST._
import net.liftweb.json.JsonDSL._
import net.liftweb.json.Printer.{compact, pretty}


object LiftJsonWithCollections extends App {

  val json = List(1, 2, 3)
  println(compact(render(json)))

  val map = Map("fname" -> "Alvin", "lname" -> "Alexander")
  println(compact(JsonAST.render(map)))
  //human readable format
  println(pretty(JsonAST.render(map)))
}
