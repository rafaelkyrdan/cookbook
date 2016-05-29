/**
  * Instance and static members
  * Define your class and object in the same file,
  * giving them the same name.
  */

// class
// includes instance members
class Pizz(var crustType: String) {
  override def toString = "Crust type is " + crustType
}

//companion object
//static members
object Pizz {
  val CRUST_TYPE_THIN = "thin"
  val CRUST_TYPE_THICK = "thick"

  def getFoo = "Foo"
}

val p = new Pizz(Pizz.CRUST_TYPE_THIN)


//both have access to each other private members
class Foo {
  private val secret = 2
}

object Foo {
  // access the private class field 'secret'
  def double(foo: Foo) = foo.secret * 2
}

val f = new Foo
Foo.double(f)




