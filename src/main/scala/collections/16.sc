/**
  * Lazy view
  *
  */

(1 to 100)
(1 to 100).view

val view = (1 to 100).view
val x = view.force


(1 to 100).foreach(println)
(1 to 100).view.foreach(println)

(1 to 100).map {
  _ * 2
}


//view implements all transformers lazily
(1 to 100).view.map {
  _ * 2
}

//return result immediately
val y = (1 to 1000).view.map { e => Thread.sleep(10)
  e * 2
}

//return result after 10 sec
//val y1 = (1 to 1000).map { e => Thread.sleep(10)
//  e * 2
//}

val arr = (1 to 10).toArray
val view2 = arr.view.slice(2, 5)

arr(2) = 42
//view is affected
view2.foreach(println)

view2(2) = 30
//arr is affected
arr



