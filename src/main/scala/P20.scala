package org.p99.scala

object P20 {
  //    Return the list and the removed element in a Tuple. Elements are numbered from 0.
  def removeAt(k: Int, xs: List[Symbol]) = (xs.take(k) ++ xs.drop(k + 1), xs(k))
}
