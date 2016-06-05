import java.io._

var in = None: Option[FileInputStream]
var out = None: Option[FileOutputStream]

try {
  in = Some(new FileInputStream("/Users/rafaelkyrdan/projects/cookbook/data/Test.class"))
  out = Some(new FileOutputStream("/Users/rafaelkyrdan/projects/cookbook/data/Test.class.copy"))

  var c = 0
  while ( {c = in.get.read; c != -1 }) {
    out.get.write(c)
  }

} catch {
  case e: IOException => e.printStackTrace()
} finally {
  println("entered finally ...")
  if (in.isDefined) in.get.close
  if (out.isDefined) out.get.close
}

