/**
  * zipWithIndex and zip
  *
  */

val days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

days.zipWithIndex.foreach{
  case (day, counter) => println(s"$counter - $day")
}


days.zip(Stream from 1).foreach{
  dc => println(s"${dc._2} is ${dc._1}")
}


