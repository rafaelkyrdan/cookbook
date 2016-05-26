/**
  * Visibility of fields
  *
  */

class Person(val firstName: String,
             val lastName: String,
             var age: Int,
             address: String,
             private var taxId:Long
            )
val p = new Person("Rafael", "Kyrdan", 34, "Kyiv", 2342L)

//only getters for val
p.firstName
p.lastName

//getter and setter for var
p.age
p.age = 33

//doesn't generate for field without var or val
//p.address // error

//private keyword prevents getter and setter generating

//case class parameters are val by default
case class Person2(name:String)
val p2 = Person2("Rafael")
p2.name











