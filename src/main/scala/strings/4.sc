/**
  * String interpolation
  * A processed string literal
  */

val name = "Rafael"
val age = 34
val weight = 75.00
println(s"$name is $age years old, and weight is $weight kilos")

println(s"age next year: ${age + 1}")

println(s"you are 34 years old: ${age == 34}")

case class Student(name: String, score: Int)

val rafael = Student("Rafael", 150)
println(s"${rafael.name} has a score of ${rafael.score}")


/**
  * f string interpolation
  */


println(f"$name is $age years old, and weight is $weight%.2f kilos")
println(f"$name is $age years old, and weight is $weight%.0f kilos")

/**
  * raw string interpolation
  */


s"foo\nbar"
raw"foo\nbar"

/**
  * formatting
  */


val s = "%s is %d years old".format(name, age)
println(s)






