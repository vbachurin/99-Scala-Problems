package org.p99.scala

object P03 {
  def nth[T](k: Int, xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException
    case h :: t => if (k == 0) h else nth(k - 1, t)
  }
}
