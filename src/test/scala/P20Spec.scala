package org.p99.scala

import org.scalatest._

class P20Spec extends UnitSpec {

  "removeAt() method" should "Remove the Kth element from a list" in {
    assert(P20.removeAt(1, List('a, 'b, 'c, 'd)) === (List('a, 'c, 'd),'b))
  }
}

