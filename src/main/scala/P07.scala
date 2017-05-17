package org.p99.scala

object P07 {
  def flatten[T](list: List[T]):List[T] = list match {
    case Nil => list
    case (h: List[T]) :: t => flatten(h) ++ flatten(t)
    case h :: t => h :: flatten(t)
  }
}
