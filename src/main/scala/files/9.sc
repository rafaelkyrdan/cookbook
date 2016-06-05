import java.io.File

/**
  * Sub directories
  *
  */
val dir = "/Users/rafaelkyrdan/projects/cookbook"

def getListOfSubDirectories(dir: String): List[String] = {
  val folder = new File(dir)
  if (folder.exists() && folder.isDirectory) {
    folder.listFiles
      .filter(_.isDirectory)
      .map(_.getName)
      .toList
  } else {
    List[String]()
  }
}
getListOfSubDirectories(dir)
