package org.p99.scala

object P10 {
    def encode[T](xs: List[T]): List[(Int, T)] = P09.pack(xs).map(l => (l.length, l.head))
//  def encode[T](xs: List[T]): List[(Int, T)] = for {
//    sublist <- P09.pack(xs)
//    el <- sublist.distinct
//  } yield (sublist.length, el)
}
