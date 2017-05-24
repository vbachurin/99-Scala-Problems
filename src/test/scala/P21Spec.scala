package org.p99.scala

import org.scalatest._

class P21Spec extends UnitSpec {

  "insertAt() method" should "Insert an element at a given position into a list" in {
    assert(P21.insertAt('new, 1, List('a, 'b, 'c, 'd)) === List('a, 'new, 'b, 'c, 'd))
  }
}

