package org.p99.scala

import scala.util.Random

object P23 {
  def randomSelect(i: Int, xs: List[Symbol]): List[Symbol] = i match {
    case 0 => Nil
    case n => {
      val (remainder, el) = P20.removeAt(Random.nextInt(xs.size), xs)
      el :: randomSelect(n - 1, remainder)
    }
  }

}
