package org.p99.scala

import org.scalatest._

class P24Spec extends UnitSpec {

  "lotto() method" should "Draw N different random numbers from the set 1..M" in {
    val n = 6
    val m = 49
    val res = P24.lotto(n, m)
    assert(res.length == n)
    assert(res.forall(_ <= m))
  }

}

