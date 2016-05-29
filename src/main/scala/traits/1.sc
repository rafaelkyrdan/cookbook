/**
  * Traits, at their most basic case can be used as
  * Java interfaces, but they are more powerful
  */

//class Foo extends Trait1 with Trait2 with Trait3

/**
  * Fields in Traits
  *
  */

trait PizzaTrait {
  var numToppings: Int // abstract
  var size = 14 // concrete
  val maxNumToppings = 10 // concrete
}

class Pizza extends PizzaTrait {
  // 'override' not needed
  var numToppings = 0
  // 'var' and 'override' not needed
  size = 16
  // `override` keyword is mandatory
  override val maxNumToppings = 5 
}

