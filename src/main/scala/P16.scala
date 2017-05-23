package org.p99.scala

object P16 {
  def drop(n: Int, xs: List[Symbol]) = {
    def _drop(m: Int, acc: List[Symbol], xs: List[Symbol]): List[Symbol] = xs match {
      case Nil => acc
      case h :: t =>
        if (m == 1)   _drop(n, acc, t)
        else          _drop(m - 1, acc ++ List(h), t)
    }

    _drop(n, List[Symbol](), xs)
  }

//  def drop2(n: Int, xs: List[Symbol]) = xs.grouped(n).flatMap(_.take(n - 1)).toList

}
