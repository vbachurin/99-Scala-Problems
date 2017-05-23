package org.p99.scala

object P14 {
  def duplicate(xs: List[Symbol]) = xs flatMap(x => List(x, x))
}
