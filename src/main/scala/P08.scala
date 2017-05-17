package org.p99.scala

object P08 {
  def compress[T](xs: List[T]): List[T] = xs.foldRight(List[T]())((el, res) => el :: res.dropWhile(_ == el))
}


