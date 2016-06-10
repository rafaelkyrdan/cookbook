import java.io.IOException
import javax.sound.sampled.LineUnavailableException

/**
  *
  */

class Thrower {

  @throws(classOf[Exception])
  def exceptionThrower {
    throw new Exception("Exception!")
  }


  @throws(classOf[IOException])
  @throws(classOf[LineUnavailableException])
  def playSoundFileWithJavaAudio {
    // exception throwing code here ...
  }
}
