package org.p99.scala

object P11 {
  def encodeModified[T](xs: List[T]):List[Any] = P10.encode(xs).map{
    case (1, value) =>  value
    case pair =>  pair
  }
}
