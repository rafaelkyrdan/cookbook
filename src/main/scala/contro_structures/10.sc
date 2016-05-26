import java.io.{FileInputStream, FileOutputStream, IOException}

/**
  * Try catch finally
  */

val s = "s"
try {
  val i = s toInt
} catch {
  case e:Exception => e.printStackTrace()
  case t: Throwable => t.printStackTrace()
  case _: Throwable => println("exception ignored")
}

var in = None:Option[FileInputStream]
var out = None:Option[FileOutputStream]

try {
 in  = Some(new FileInputStream(""))
 out  = Some(new FileOutputStream(""))

 var c = 0
 while ({
   c = in.get.read
   c != -1
 }) {
   out.get.write(c)
 }

} catch {

  case e: IOException => e.printStackTrace()
  case ex: Exception => ex.printStackTrace()

} finally {
  println("entered finally ...")
  if (in.isDefined) in.get.close()
  if (out.isDefined) out.get.close()
}




