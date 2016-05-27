/**
  * When to use abstract class:
  *
  * - code will be called from Java code
  * - you want to create a base class that requires
  * constructor arguments, because trait doesn't allow
  * constructor parameters
  */

abstract class Animal(name: String)

//trait Animal(name: String)



