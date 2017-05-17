package org.p99.scala

import org.scalatest._

class P04Spec extends UnitSpec {

  "length() method" should "return the length of non-empty list" in {
    assert(P04.length(List(1, 1, 2, 3, 5, 8)) === 6)
    assert(P04.length(List(8)) === 1)
    assert(P04.length(List()) === 0)
  }


}

