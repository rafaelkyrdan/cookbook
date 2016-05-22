/**
  * Extracting parts
  *
  */

val pattern = "([0-9]+) ([a-zA-Z]+)".r
val pattern(count, fruit) = "100 bananas"

// match "movies 80301"
val MoviesZipRE = "movies (\\d{5})".r
// match "movies near boulder, co"
val MoviesNearCityStateRE = "movies near ([a-z]+), ([a-z]{2})".r


