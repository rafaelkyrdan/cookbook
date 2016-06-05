/**
  * Pipeline of commands
  *
  */

import scala.sys.process._
val numProcs = ("ps auxw" #| "wc -l").!!.trim
println(s"#procs = $numProcs")

//val r = Seq("/bin/sh", "-c", "ls | grep .scala").!!

/**
  * Redirect
  *
  */

import java.io.File

import scala.sys.process._

val filename = "/Users/rafaelkyrdan/projects/cookbook/data/file.txt"
val filename2 = "/Users/rafaelkyrdan/projects/cookbook/data/file2.txt"
val filename3 = "/Users/rafaelkyrdan/projects/cookbook/data/file3.txt"


("ls -al" #> new File(filename)).!
("ps aux" #> new File(filename2)).!
"pwd" !

("ps aux" #| "grep http" #> new File(filename)).!

import java.io.File
import java.net.URL

import scala.language.postfixOps
import scala.sys.process._

val googelFile = "/Users/rafaelkyrdan/projects/cookbook/data/google.txt"
new URL("http://www.google.com") #> new File(googelFile) !