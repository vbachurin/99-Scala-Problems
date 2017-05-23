package org.p99.scala

import org.scalatest._

class P18Spec extends UnitSpec {
  "slice() method" should "Extract a slice from a list" in {
    //Given two indices, I and K, the slice is the list containing the elements from
    // and including the Ith element up to but not including the Kth element of the original list.
    // Start counting the elements with 0.
    assert(P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('d, 'e, 'f, 'g))
  }

}

