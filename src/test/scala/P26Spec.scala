package org.p99.scala

import org.scalatest._

class P26Spec extends UnitSpec {

  "combinations() method" should "Generate the combinations of K distinct objects chosen from the N elements of a list" in {
    // In how many ways can a committee of 3 be chosen from a group of 12 people?
    // We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient).
    // For pure mathematicians, this result may be great. But we want to really generate all the possibilities.
    val init = List('a, 'b, 'c, 'd, 'e, 'f)
    val k = 3
    val res = P26.combinations(k, init)
    assert(res.length == 20)
    assert(res.forall(_.length == k))
    assert(res.forall(_.forall(init.contains(_))))
  }

}

