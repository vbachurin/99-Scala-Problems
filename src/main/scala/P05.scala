package org.p99.scala

object P05 {
  def reverse[T](xs: List[T]): List[T] = xs.foldLeft(List[T]())((res, el) => el :: res)
}
