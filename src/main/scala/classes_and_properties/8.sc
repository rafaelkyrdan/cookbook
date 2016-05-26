
/**
  * Initializing field with block or function
  */


class Foo {

  lazy val text = {
    var lines = ""
    try {
      lines = io.Source.fromFile("/etc/passwd").getLines.mkString
    } catch {
      case e: Exception => lines = "Error happened"
    }

    lines
  }


  println(text)
}

val f = new Foo