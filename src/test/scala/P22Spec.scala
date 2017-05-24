package org.p99.scala

import org.scalatest._

class P22Spec extends UnitSpec {

  "range() method" should "Create a list containing all integers within a given range" in {
    assert(P22.range(4, 9) === List(4, 5, 6, 7, 8, 9))
  }

}

