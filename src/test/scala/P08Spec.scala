package org.p99.scala

import org.scalatest._

class P08Spec extends UnitSpec {

  "compress() method" should "eliminate consecutive duplicates of list elements" in {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
  }

}

