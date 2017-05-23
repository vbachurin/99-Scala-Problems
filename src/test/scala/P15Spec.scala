package org.p99.scala

import org.scalatest._

class P15Spec extends UnitSpec {

  "duplicateN() method" should "duplicate the elements of a list a given number of times" in {
    assert(P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

}

