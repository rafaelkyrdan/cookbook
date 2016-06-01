val fruits = List("a", "b", "c")
for {f <- fruits} println(f)

for {
  (elem, count) <- fruits.zipWithIndex
} println(s" $elem, $count")

for ((elem, count) <- fruits.view.zipWithIndex) {
  println(s"element $count is $elem")
}

for ((elem, count) <- fruits.zip(Stream from 1)) {
  println(s"element $count is $elem")
}