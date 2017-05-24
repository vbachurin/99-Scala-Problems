package org.p99.scala

object P21 {
  def insertAt(el: Symbol, k: Int, xs: List[Symbol]) = xs.take(k) ++ (el :: xs.drop(k))
}
