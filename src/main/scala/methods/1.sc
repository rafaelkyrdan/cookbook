/**
  * Scope options for methods
  *
  * Object-private scope
  * Private
  * Package
  * Package-specific
  * Public
  *
  */

class Foo {

  //the most restrictive access
  //object-private scope - method belong only to
  //instance of the object
  private[this] def isFoo = true

  //private method
  //is available for current class
  //and other instances of the current class
  private def isBar = true

  def doFoo(other: Foo): Unit = {

    //if (other.isFoo) {} // this line won't compile

    //private method is available here
    if (other.isBar) {
      //do smth
    }


  }

}

//protected method
//can be accessed by subclass but can't be accessed
//by class from the same package

class Animal {
  protected def breathe {}
}

class Dog extends Animal {
  breathe
}

//Package scope - to make it
//just use this access modifier
//private[name_of_package]
//package com.acme.coolapp.model
//private[model]
//private[coolapp]
//private[acme]

//public scope
//method without any access modifier
//is public




