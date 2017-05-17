package org.p99.scala

object P04 {
  def length[T](xs: List[T]): Int = xs.foldLeft(0)((x, _) => x + 1)
}
