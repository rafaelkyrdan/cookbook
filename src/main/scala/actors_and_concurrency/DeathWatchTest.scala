package actors_and_concurrency

import akka.actor.{Actor, ActorSystem, PoisonPill, Props, Terminated}

object DeathWatchTest extends App {
  // create the ActorSystem instance
  val system = ActorSystem("DeathWatchTest")
  // create the Parent that will create Denny
  val parent = system.actorOf(Props[Parent], name = "Parent")
  parent ! "any message"
  Thread.sleep(3000)
  // lookup kenny, then kill it
  val denny = system.actorSelection("/user/Parent/Denny")
  denny ! PoisonPill
  Thread.sleep(5000)
  println("calling system.shutdown")
  system.terminate()
}

class Parent extends Actor {
  // start Kenny as a child, then keep an eye on it
  val denny = context.actorOf(Props[Denny], name = "Denny")
  context.watch(denny)

  def receive = {
    case Terminated(denny) => println("OMG, they killed Denny")
    case _ => println("Parent received a message")
  }
}

class Denny extends Actor {
  def receive = {
    case _ => println("Kenny received a message")
  }
}

