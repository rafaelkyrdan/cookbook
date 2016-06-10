/**
  *
  */

import scala.beans.BeanProperty

class Person(@BeanProperty var firstName: String,
             @BeanProperty var lastName: String) {
  override def toString = s"Person: $firstName $lastName"
}
