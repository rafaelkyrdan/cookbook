package web_services


import net.liftweb.json._
import net.liftweb.json.JsonDSL._


case class Friend(name: String, address: Address) {
  var friends = List[Friend]()
}

case class Address(city: String, state: String)

object LiftJsonDslExample extends App {

  //import net.liftweb.json.JsonParser._
  implicit val formats = DefaultFormats

  val merc = Friend("Mercedes", Address("Somewhere", "KY"))
  val mel = Friend("Mel", Address("Lake Zurich", "IL"))
  val friends = List(merc, mel)
  val p = Friend("Alvin Alexander", Address("Talkeetna", "AK"))
  p.friends = friends

  // define the json output
  val json = ("person" ->
    ("name" -> p.name) ~
      ("address" ->
        ("city" -> p.address.city) ~
          ("state" -> p.address.state)) ~
      ("friends" -> friends.map { f =>
        ("name" -> f.name) ~
          ("address" ->
            ("city" -> f.address.city) ~
              ("state" -> f.address.state))
      })
    )

  println(pretty(render(json)))

}

object LiftJsonDslExample2 extends App {

  val merc = Friend("Mercedes", Address("Somewhere", "KY"))
  val mel = Friend("Mel", Address("Lake Zurich", "IL"))
  val friends = List(merc, mel)
  val p = Friend("Alvin Alexander", Address("Talkeetna", "AK"))
  p.friends = friends

  def getAddress(a: Address) = {
    ("address" ->
      ("city" -> a.city) ~
        ("state" -> a.state))
  }

  def getFriends(p: Friend) = {
    ("friends" -> p.friends.map {
      f => ("name" -> f.name) ~ getAddress(f.address)
    })

  }

  val json = ("person" ->
    ("name" -> p.name) ~
      getAddress(p.address) ~
      getFriends(p)
    )

  println(pretty(render(json)))


}
