/**
  * Preventing getter and setter being created
  * Solution use private modifier
  */


class Stock {
  private var currentPrice: Double = _

  def setPrice(p: Double) {
    currentPrice = p
  }

  def isHigher(that: Stock): Boolean = {
    this.currentPrice > that.currentPrice
  }
}

val s1 = new Stock
val s2 = new Stock

s1.setPrice(100)
s2.setPrice(200)

s1.isHigher(s2)


//Example with private[this]
//more strict rule  - object-private
//field can only be accessed from the object
//which contain it

class Stock2 {
  private[this] var currentPrice: Double = _

  def setPrice(p: Double) {
    currentPrice = p
  }

  // won't compile
//  def isHigher(that: Stock2): Boolean = {
//    this.currentPrice > that.currentPrice
//  }
}
