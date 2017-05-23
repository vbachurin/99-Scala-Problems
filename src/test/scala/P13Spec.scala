package org.p99.scala

import org.scalatest._

class P13Spec extends UnitSpec {

  "encodeDirect() method" should "run-length encoding of a list" in {
    assert(P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      === List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}

