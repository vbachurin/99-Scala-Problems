package org.p99.scala

object P09 {
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
//    case h :: t => { val (x1, x2) = t.span(_ == h); (h :: x1) :: pack(x2)}
    case h :: t => (h :: t.takeWhile(_ == h)) :: pack(t.dropWhile(_ == h))
  }

}
