/**
  * Comparing floating numbers
  * with "approximately equals" method
  *
  */

def ~=(x:Double, y:Double, precision:Double):Boolean = {
  if ((x - y).abs < precision) true  else  false
}

val a = 0.3
val b = 0.1 + 0.2

a == b

~=(a, b, 0.0001)
~=(b, a, 0.0001)

~=(a, b, 0.00000000000000001)


