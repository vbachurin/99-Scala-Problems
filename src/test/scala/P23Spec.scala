package org.p99.scala

import org.scalatest._

class P23Spec extends UnitSpec {


  "randomSelect() method" should "Extract a given number of randomly selected elements from a list" in {
    val num = 3
    val symbols = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val res = P23.randomSelect(num, symbols)
    assert(res.length == num)
    assert(res.forall(symbols.contains(_)))
  }

}

