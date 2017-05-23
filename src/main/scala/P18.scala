package org.p99.scala

object P18 {
  //Given two indices, I and K, the slice is the list containing the elements from
  // and including the Ith element up to but not including the Kth element of the original list.
  // Start counting the elements with 0.
  def slice(i: Int, k: Int, xs: List[Symbol]) = xs drop i take k - i

  def slice2(i: Int, k: Int, xs: List[Symbol]) = xs.slice(i, k)
}
