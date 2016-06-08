package actors_and_concurrency

import akka.actor._

object PingPongTest {
  def main(args: Array[String]) {

    val system = ActorSystem("PingPongSystem")
    val pong = system.actorOf(Props[Pong], name = "pong")
    val ping = system.actorOf(Props(new Ping(pong)), name = "ping") // start the action
    ping ! StartMessage
    // commented-out so you can see all the output
    //system.shutdown

  }
}
