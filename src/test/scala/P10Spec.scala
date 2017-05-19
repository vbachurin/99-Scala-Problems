package org.p99.scala

import org.scalatest._

class P10Spec extends UnitSpec {

  "encode() method" should "run-length encoding of a list" in {
    assert(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      === List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }
}

