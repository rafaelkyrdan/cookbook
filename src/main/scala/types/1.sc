/**
  * Structural type
  *
  */

//Method requires that parameter obj should have a method
//speak with following signature.

def callSpeak[A <: { def speak(): Unit }](obj: A) {
  // code here ...
  obj.speak()
}
