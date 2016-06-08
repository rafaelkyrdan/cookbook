package actors_and_concurrency

import akka.actor.{ActorSystem, Props, _}
import akka.pattern.gracefulStop

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.language.postfixOps

object GracefulStopTest extends App {

  val system = ActorSystem("GracefulStopTest")
  val testActor = system.actorOf(Props[TestActor], name = "TestActor")
  // try to stop the actor gracefully
  try {
    val stopped: Future[Boolean] = gracefulStop(testActor, 2 seconds)
    Await.result(stopped, 3 seconds)
    println("testActor was stopped")
  } catch {
    case e: Exception => e.printStackTrace
  } finally {
    system.terminate()
  }


}

class TestActor extends Actor {
  def receive = {
    case _ => println("TestActor got message")
  }

  override def postStop {
    println("TestActor: postStop")
  }
}
