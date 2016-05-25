import java.util.Currency

/**
  * Formatting numbers and currency
  *
  */

val pi = scala.math.Pi
println(f"$pi%1.5f")

"%1.5f".format(pi)

/**
  * Decimal and thousand separators
  */

val formatter = java.text.NumberFormat.getIntegerInstance
formatter.format(1000)
formatter.format(10000)
formatter.format(100000)
formatter.format(1000000)
formatter.format(10000000)
formatter.format(100000000)
formatter.format(1000000000)

val locale = new java.util.Locale("de", "DE")
val formatter2 = java.text.NumberFormat.getIntegerInstance(locale)

formatter2.format(1000)
formatter2.format(10000)
formatter2.format(100000)
formatter2.format(1000000)
formatter2.format(10000000)
formatter2.format(100000000)
formatter2.format(1000000000)

val formatter3 = java.text.NumberFormat.getInstance(locale)
formatter3.format(1000.34)
formatter3.format(10000.34)
formatter3.format(100000.34)

val formatter4 = java.text.NumberFormat.getCurrencyInstance

formatter4.format(1000.34)
formatter4.format(10000.34)
formatter4.format(100000.34)

val eur = Currency.getInstance(locale)
formatter.setCurrency(eur)
formatter4.format(2343.343)














