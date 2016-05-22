/**
  *
  */

val upper = "hello world".map(_.toUpper)
val upper2 = "hello world".filter(_ != 'l').map(_.toUpper)

val upper3 = for {
  c <- "hell world"
} yield c.toUpper


val upper4 = for {
  c <- "hello world"
  if c != 'l'
} yield c.toUpper

"HELLO".map(c => (c.toByte + 32).toChar)


def toLower(c: Char) = {
  (c.toByte + 32).toChar
}

"WORLD".map(toLower)

val toLower2 = (c: Char) => (c.toByte + 32).toChar

"RAFAEL".map(toLower2)


