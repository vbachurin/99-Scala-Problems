package org.p99.scala

object P06 {

  def isPalindrome(xs: List[Int]): Boolean = {
    xs == P05.reverse(xs)
  }

  def isPalindrome2(xs: List[Int]): Boolean = {
    val (xs1, xs2) = xs.splitAt(xs.length / 2)
    (xs1 == xs2.reverse) || (xs1 == xs2.drop(1).reverse)
  }
}
