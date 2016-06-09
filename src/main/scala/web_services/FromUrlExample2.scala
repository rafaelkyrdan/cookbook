package web_services

/**
  * Created by rafaelkyrdan on 6/9/16.
  */
object FromUrlExample2 {

  def main(args: Array[String]) {

    try {
      val content = get("https://facebook.com")
      println(content)
    } catch {
      case ioe: java.io.IOException => // handle this
      case ste: java.net.SocketTimeoutException => // handle this
    }
  }

  @throws(classOf[java.io.IOException])
  @throws(classOf[java.net.SocketTimeoutException])
  def get(url: String,
          connectTimeout: Int = 5000,
          readTimeout: Int = 5000,
          requestMethod: String = "GET") = {

    import java.net.{URL, HttpURLConnection}
    val connection = (new URL(url)).openConnection.asInstanceOf[HttpURLConnection]
    connection.setConnectTimeout(connectTimeout)
    connection.setReadTimeout(readTimeout)

    connection.setRequestMethod(requestMethod)
    val inputStream = connection.getInputStream
    val content = io.Source.fromInputStream(inputStream).mkString
    if (inputStream != null) inputStream.close
    content

  }

}
