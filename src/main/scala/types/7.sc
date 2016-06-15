/**
  *
  * @tparam A
  */

sealed abstract class Attempt[A] {
  def getOrElse[B >: A](default: => B): B = if (isSuccess) get else default
  var isSuccess = false
  def get: A
}

final case class Failed[A](val exception: Throwable) extends Attempt[A] {
  isSuccess = false
  def get: A = throw exception
}

final case class Succeeded[A](value: A) extends Attempt[A] {
  isSuccess = true
  def get = value
}

object Attempt {
  def apply[A](f: => A): Attempt[A] =
    try {
      val result = f
      return Succeeded(result)
    } catch {
      case e: Exception => Failed(e)
    }
}

