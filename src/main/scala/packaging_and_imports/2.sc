/**
  * Importing
  */

//one class
import java.io.File

//several classes
import java.io.{File, IOException, FileNotFoundException}

//everything
import java.io._

class Foo {
  // only visible in this class
  import javax.swing.JFrame
}


class Bar {
  // only visible in this class
  import scala.util.Random
}