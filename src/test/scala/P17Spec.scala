package org.p99.scala

import org.scalatest._

class P17Spec extends UnitSpec {

  "split() method" should "split a list into two parts" in {
    assert(P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ===
      (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}

