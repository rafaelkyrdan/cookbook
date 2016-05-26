import scala.annotation.tailrec

/**
  * Creating own control structures
  *
  */


@tailrec
def whilst(testCondition: => Boolean)(codeBlock: => Unit) {
  if (testCondition) {
    codeBlock
    whilst(testCondition)(codeBlock)
  }
}

