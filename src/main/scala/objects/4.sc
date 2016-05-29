import java.util.Calendar
import java.text.SimpleDateFormat

/**
  * Object as Singleton
  */

object CashRegister {
  def open {
    println("opened")
  }

  def close {
    println("closed")
  }
}

CashRegister.open
CashRegister.close

object DateUtils {

  def getCurrentDate:String = getCurrentDateTime("EEEE, MMMM d")

  def getCurrentTime:String = getCurrentDateTime("K:m aa")

  private def getCurrentDateTime(format:String):String = {
    val dateTimeFormat = new SimpleDateFormat(format)
    val cal = Calendar.getInstance()
    dateTimeFormat.format(cal.getTime())
  }
}

DateUtils.getCurrentDate
DateUtils.getCurrentTime

