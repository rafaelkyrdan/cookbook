/**
  * Starting with Actor
  */

import akka.actor.{Actor, ActorSystem, Props}


class HelloActor extends Actor {
  override def receive: Receive = {
    case "hello" => println("hello message received")
    case _ => println("???")
  }
}

val system = ActorSystem("hellosystem")
val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")

helloActor ! "hello"
helloActor ! "buenos"

system.shutdown()