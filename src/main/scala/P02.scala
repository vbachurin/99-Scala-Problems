package org.p99.scala

object P02 {
  def penultimate[T](xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException
    case prelast :: _ :: Nil => prelast
    case _ :: t => penultimate(t)
  }


}
