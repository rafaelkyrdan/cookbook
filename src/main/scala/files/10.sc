import sys.process._

/**
  * Executing the external commands
  *
  */

//scala.sys.process
//Use the ! method to execute the command and get its exit status.
//Use the !! method to execute the command and get its output.
//Use the lines method to execute the command in the background and get its result as a Stream.

val exitCode = "ls -al".!
exitCode
val exitCode2 = Process("ls").!

//stream
val process = Process("find / -print").lines


val result = "ls -al" !!
val result2 = "pwd" !!