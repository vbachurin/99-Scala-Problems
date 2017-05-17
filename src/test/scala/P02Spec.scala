package org.p99.scala

import org.scalatest._

class P02Spec extends UnitSpec {

  "penultimate() method" should "return last but one element of non-empty list" in {
    assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
  }

  it should "throw the exception in case of single-element list" in {
    assertThrows[NoSuchElementException] {
      P02.penultimate(List(9))
    }
  }

  it should "return NoSuchElementException in case of empty list" in {
    assertThrows[NoSuchElementException] {
      P02.penultimate(List())
    }
  }

}

