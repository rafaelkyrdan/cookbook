import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}


/**
  * Serialisation
  *
  */

@SerialVersionUID(101L)
class Stock(var symbol: String, var price: BigDecimal) extends Serializable {
  override def toString = f"$symbol%s is ${price.toDouble}%.2f"
}


val filename = "/Users/rafaelkyrdan/projects/cookbook/data/Stock.class"
val nflx = new Stock("NFLX", BigDecimal(85.00))

val oos = new ObjectOutputStream(new FileOutputStream(filename))
oos.writeObject(nflx)
oos.close

val ois = new ObjectInputStream(new FileInputStream(filename))
val stock = ois.readObject.asInstanceOf[Stock]
ois.close
println(stock)