/**
  * Setting uninitialised fields
  *
  */

case class Person(var name:String, var lastname:String){
  var address = None[Address]
}

case class Address(var city:String, var street:String)