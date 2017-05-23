package org.p99.scala

object P15 {
  def duplicateN(n: Int, xs: List[Symbol]) = xs flatMap(x => List.fill(n)(x))

}
