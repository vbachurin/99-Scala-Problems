package org.p99.scala

import P26.combinations

object P27 {
  // a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
  // Write a function that generates all the possibilities.
  def group3[A](xs: List[A]): List[List[List[A]]] =
    for {
      a <- combinations(2, xs)
      noA = xs.filterNot(_ == a)
      b <- combinations(3, noA)
    } yield List(a, b, noA.filterNot(_ == b))

  // TODO

}
