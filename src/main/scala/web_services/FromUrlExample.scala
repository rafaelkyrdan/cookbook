package web_services


object FromUrlExample{

  def main(args: Array[String]) {

    println(get("https://facebook.com"))
  }

  @throws(classOf[java.io.IOException])
  def get(url: String) = scala.io.Source.fromURL(url).mkString
}
