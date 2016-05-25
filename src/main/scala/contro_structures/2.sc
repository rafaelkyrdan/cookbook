/**
  *
  */

for {
  i <- 0 to 2
  j <- 0 to 2
} println(s"i = $i, j = $j")


val arr = Array.ofDim[Int](2, 2)
arr(0)(0) = 0
arr(0)(1) = 1
arr(1)(0) = 2
arr(1)(1) = 3

for {
  i <- 0 to 1
  j <- 0 to 1
} println(s"($i),($j) = ${arr(i)(j)}")






