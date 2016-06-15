import scala.collection.mutable.ArrayBuffer

/**
  * Upper bound example
  */

trait CrewMember

class Officer extends CrewMember

class RedShirt extends CrewMember

trait Captain

trait FirstOfficer

trait ShipsDoctor

trait StarfleetTrained

val kirk = new Officer with Captain
val spock = new Officer with FirstOfficer
val bones = new Officer with ShipsDoctor

class Crew[A <: CrewMember] extends ArrayBuffer[A]

val officers = new Crew[Officer]()
officers += kirk
officers += spock
officers += bones

val redShirt = new RedShirt
// ERROR: this won't compile
//officers += redShirt




