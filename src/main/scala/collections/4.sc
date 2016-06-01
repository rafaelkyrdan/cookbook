/**
  * Mutable variables and immutable collections
  *
  */

//create a new collection each time
var sisters = Vector("Vanessa")
sisters :+ "Melissa"
sisters :+ "Marissa"

//but this doesn't work
//sisters(0) = "Molly"
