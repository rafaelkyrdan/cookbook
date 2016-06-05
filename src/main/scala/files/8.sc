import java.io.File

/**
  * Listing the directory
  *
  */

val dir = "/Users/rafaelkyrdan/projects/cookbook/data"

def getListOfFiles(dir: String): List[File] = {
  val d = new File(dir)
  if (d.exists && d.isDirectory) {
    d.listFiles.filter(_.isFile).toList
  }
  else {
    List[File]()
  }
}

def getListOfFiles(dir: String, extensions: List[String]): List[File] = {
  val d = new File(dir)
  if (d.exists && d.isDirectory) {
    d.listFiles.filter(_.isFile).toList.filter{
      file => extensions.exists(file.getName.endsWith(_))
    }
  }
  else {
    List[File]()
  }
}

getListOfFiles(dir)
val okFileExtensions = List("txt")
val txtFiles = getListOfFiles(dir, okFileExtensions)

