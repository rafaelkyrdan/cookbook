/**
  * Enumeration
  */

object Margin extends Enumeration {
  type Margin = Value
  val TOP, BOTTOM, LEFT, RIGHT = Value
}

var currentMargin = Margin.TOP

Margin.values foreach println


