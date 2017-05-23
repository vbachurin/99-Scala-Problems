package org.p99.scala

object P13 {
  def encodeDirect[T](xs: List[T]): List[(Int, T)] = xs.foldRight(List[(Int, T)]()) { (el, accum) =>
    accum match {
      case (num, sym) :: tail if (sym == el) => (num + 1, el) :: tail
      case _ => (1, el) :: accum
    }
  }
}
