package org.p99.scala

object P22 {
  def range(begin: Int, end: Int): List[Int] = {
    def _range(end1: Int, acc: List[Int]): List[Int] =
      if (end1 < begin)  acc
      else _range(end1 - 1, end1 :: acc)

    _range(end, List())
  }

  def rangeBuiltIn(begin: Int, end: Int) = begin to end

}
