/**
  * Few packages in one file
  *
  */

package store {

  class Foo {
    override def toString = "I store.Foo"
  }

}

package util {

  class Foo {
    override def toString = "I am util.Foo"
  }

}

package customers {

  class Foo {
    override def toString = "I am customers.Foo"
  }

  package database {

    class Foo {
      override def toString = "I am customers.database.Foo"
    }

  }

}
