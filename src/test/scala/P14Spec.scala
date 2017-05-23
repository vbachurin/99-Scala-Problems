package org.p99.scala

import org.scalatest._

class P14Spec extends UnitSpec {

  "duplicate() method" should "duplicate the elements of a list" in {
    assert(P14.duplicate(List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }
}

