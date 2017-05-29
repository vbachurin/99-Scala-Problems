package org.p99.scala

import org.scalatest._

class P25Spec extends UnitSpec {

  "randomPermute() method" should "Generate a random permutation of the elements of a list" in {
    // Hint: Use the solution of problem P23.
    val init = List('a, 'b, 'c, 'd, 'e, 'f)
    val res = P25.randomPermute(init)
    assert(res.length == init.length)
    assert(res.forall(init.contains(_)))
  }

}

