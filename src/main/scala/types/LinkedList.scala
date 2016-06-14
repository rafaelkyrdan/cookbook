package types

/**
  * Generic types example
  *
  */

class LinkedList[A] {

  private class Node[A](elem: A) {
    var next: Node[A] = _

    override def toString = elem.toString
  }

  private var head: Node[A] = _

  def add(elem: A) {
    val n = new Node(elem)
    n.next = head
    head = n
  }

  private def printNodes(n: Node[A]) {
    if (n != null) {
      println(n)
      printNodes(n.next)
    }
  }

  def printAll() {
    printNodes(head)
  }
}


object LinkedListExample extends App {

  val ints = new LinkedList[Int]
  ints.add(1)
  ints.add(2)
  ints.add(3)
  ints.printAll()

  val strings = new LinkedList[String]()
  strings.add("Nacho")
  strings.add("Libre")
  strings.printAll()
}