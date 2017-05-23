package org.p99.scala

object P12 {
  def decode[T](xs: List[(Int, T)]):List[T] = xs flatMap{case (num, sym) => List.fill(num)(sym)}
//  def decode[T](xs: List[(Int, T)]):List[T] = xs match {
//    case Nil => Nil
//    case (0, _) :: tail => decode(tail)
//    case (num: Int, sym: T) :: tail => sym :: decode((num - 1, sym) :: tail)
//  }


}
