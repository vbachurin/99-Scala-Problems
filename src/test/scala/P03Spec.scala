package org.p99.scala

import org.scalatest._

class P03Spec extends UnitSpec {

  "nth() method" should "return the Kth element of non-empty list" in {
    assert(P03.nth(2, List(1, 1, 2, 3, 5, 8)) === 2)
    assert(P03.nth(4, List(1, 1, 2, 3, 5, 8)) === 5)
  }

  it should "throw the exception in case the list is shorter than K" in {
    assertThrows[NoSuchElementException] {
      P03.nth(2, List(9))
    }
  }

  it should "return NoSuchElementException in case of empty list" in {
    assertThrows[NoSuchElementException] {
      P03.nth(1, List())
    }
  }

}

