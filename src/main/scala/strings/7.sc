/**
  *
  */

val address = "19, Williams street".replaceAll("[0-9]", "x")
val regex = "[0-9]".r

val newAddress = regex.replaceAllIn("Williams street apartment 177", "x")

val result = "19, Williams street apartment 177".replaceFirst("[0-9]", "x")

val result2 = regex.replaceFirstIn("19, Williams street apartment 177", "x")


