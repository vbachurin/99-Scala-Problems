package org.p99.scala

import org.scalatest._

class P11Spec extends UnitSpec {

  "encodeModified() method" should "run-length encoding of a list" in {
    assert(P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      === List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

}

