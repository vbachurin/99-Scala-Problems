package org.p99.scala

import org.scalatest._

class P19Spec extends UnitSpec {

  "rotate() method" should "Rotate a list N places to the left" in {
    assert(P19.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ===
      List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))

    assert(P19.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ===
      List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))
  }
}

