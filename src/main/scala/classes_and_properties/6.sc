/**
  * How to override the default getter and setter
  * it is not possible, there is just one option
  * create custom methods and use trick with
  * underscores
  *
  * or just follow JavaBean convention
  *
  * @param _name
  */

class Person(private var _name: String) {

  //accessor - getter
  def name = _name

  //mutator - setter
  def name_=(aName: String) {
    _name = aName
  }

}

val p = new Person("Jonatan")
p.name
p.name = "Jonny"
p.name