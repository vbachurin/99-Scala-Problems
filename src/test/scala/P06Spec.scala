package org.p99.scala

import org.scalatest._

class P06Spec extends UnitSpec {

  "isPalindrome() method" should "tell truth" in {
    assert(P06.isPalindrome(List(1, 2, 2, 1)) === true)
    assert(P06.isPalindrome(List(1, 2, 3, 2, 1)) === true)
    assert(P06.isPalindrome(List(3)) === true)
    assert(P06.isPalindrome(List()) === true)
    assert(P06.isPalindrome(List(1, 2, 3, 1, 2)) === false)
  }

}

