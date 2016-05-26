/**
  * Default values for constructor
  * parameters
  * Default values eliminate the need in auxiliary
  * constructors
  */

class Socket (var timeout:Int = 1000)
val s = new Socket()
s.timeout

val s1 = new Socket(5000)
s1.timeout

val s2 = new Socket(timeout = 100000)
s2.timeout

// multiple parameters

class Socket2(val timeout: Int = 1000, val linger: Int = 2000) {
  override def toString = s"timeout: $timeout, linger: $linger"
}

new Socket2()
new Socket2(3000)
new Socket2(3000, 4000)

//using named parameters

new Socket2(timeout = 2000, linger = 1000)
new Socket2(linger = 1000)
new Socket2(timeout = 1000)
new Socket2(linger = 1000, timeout = 1000)


