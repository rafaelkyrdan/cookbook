/**
  * Default values
  *
  */

class Connection {
  def makeConnection(timeout: Int = 5000, protocol: String = "http") {
    println("timeout = %d, protocol = %s".format(timeout, protocol))
  }
}

val c = new Connection
c.makeConnection()
c.makeConnection(6000)
c.makeConnection(3000, "https")

c.makeConnection(timeout = 10000)
c.makeConnection(protocol = "ftp")

