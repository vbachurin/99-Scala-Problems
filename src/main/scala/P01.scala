package org.p99.scala

object P01 {

  def last[A](xs: List[A]): A = xs match {
    case List(x) => x
    case h :: t => last(t)
    case Nil => throw new NoSuchElementException("Last of empty list")
  }

  // last(List(1, 1, 2, 3, 5, 8))

}
