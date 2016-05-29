/**
  * Ensuring a Trait Can Only Be Added
  * to a Type That Has a Specific Method
  *
  */

//The following syntax requires that any class
//that attempt to mit it in must have
//an ejectWarpCore method with following signature

trait WarpCore {
  this: {def ejectWarpCore(password: String): Boolean} =>
}


//Require that class must have multiple methods
trait WarpCore2 {
  this: {
    def ejectWarpCore(password: String): Boolean
    def startWarpCore: Unit
  } =>
}

class Starship

class Enterprise extends Starship with WarpCore2 {
  def ejectWarpCore(password: String): Boolean = {
    if (password == "password") {
      println("core ejected"); true
    } else false
  }

  def startWarpCore {
    println("core started")
  }
}

