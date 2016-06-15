/**
  *
  * @param blockOfCode
  * @tparam A
  * @return
  */

def timer[A](blockOfCode: => A) = {
  val startTime = System.nanoTime
  val result = blockOfCode
  val stopTime = System.nanoTime
  val delta = stopTime - startTime
  (result, delta / 1000000d)
}

val (result, time) = timer {
  Thread.sleep(500); 1
}
