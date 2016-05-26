/**
  * For comprehension
  */

for {
  i <- 0 to 10
  if i % 2  == 0
} yield i


val names = Array("chris", "ed", "maurice")
val capNames = for {
  name <- names
} yield name.capitalize

val length = for {
  name <- names
} yield {
  name.length
}

