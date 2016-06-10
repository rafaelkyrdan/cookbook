/**
  * We can't use the implemented methods of trait
  * in java code.
  * So wrap a trait in wrapper class
  *
  */

// the original trait
trait MathTrait {
  def sum(x:Int,y:Int)= x+y
}
// the wrapper class
class MathTraitWrapper extends MathTrait
