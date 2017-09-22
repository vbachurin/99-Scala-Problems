package org.p99.scala

object P26 {

  def flatMapSublists[A, B](ls: List[A])(f: List[A] => List[B]): List[B] = ls match {
    case Nil => Nil
    case sublist@(h :: t) => f(sublist) ::: flatMapSublists(t)(f)
  }

  def combinations[A](n: Int, ls: List[A]): List[List[A]] = {
    if (n == 0) List(Nil)
    else flatMapSublists(ls) { sl =>
      combinations(n - 1, sl.tail) map { sl.head :: _ }
    }
  }

}
