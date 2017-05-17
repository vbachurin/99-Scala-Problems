package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  "last() method" should "return last element of non-empty list" in {
    assert(P01.last(List(1, 1, 2, 3, 5, 8)) === 8)
  }

  it should "return the only element of single-element list" in {
    assert(P01.last(List(9)) === 9)
  }

  it should "return NoSuchElementException in case of empty list" in {
    assertThrows[NoSuchElementException] {
      P01.last(List())
    }
  }

}

