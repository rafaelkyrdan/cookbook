package web_services

import net.liftweb.json.DefaultFormats
import net.liftweb.json._


// a case class to match the JSON data
case class EmailAccount(
                         accountName: String,
                         url: String,
                         username: String,
                         password: String,
                         minutesBetweenChecks: Int,
                         usersOfInterest: List[String]
                       )


object ParseJsonArray extends App {

  implicit val formats = DefaultFormats

  // a JSON string that represents a list of EmailAccount instances
  val jsonString =
    """ {
          "accounts": [
            { "emailAccount": {
            "accountName": "YMail",
            "username": "USERNAME",
            "password": "PASSWORD",
            "url": "imap.yahoo.com",
            "minutesBetweenChecks": 1,
            "usersOfInterest": ["barney", "betty", "wilma"]
            }},
          {
          "emailAccount": {
            "accountName": "Gmail",
            "username": "USER",
            "password": "PASS",
            "url": "imap.gmail.com",
            "minutesBetweenChecks": 1,
            "usersOfInterest": ["pebbles", "bam-bam"]
            }}
          ]} """


  // json is a JValue instance
  val json = parse(jsonString)
  val elements = (json \\ "emailAccount").children
  for (acct <- elements) {
    val m = acct.extract[EmailAccount]
    println(s"Account: ${m.url}, ${m.username}, ${m.password}")
    println(" Users: " + m.usersOfInterest.mkString(","))
  }



}
