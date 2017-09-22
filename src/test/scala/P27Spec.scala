package org.p99.scala

import org.scalatest._

class P27Spec extends UnitSpec {

  "group3() method" should "Group the elements of a set into disjoint subsets" in {
//    a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
//        Write a function that generates all the possibilities.
    val init = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    val k = 3
    val res = P27.group3(init)
    println(res)
    assert(res.length == 20)
    assert(res.forall(_.length == k))
    assert(res.forall(_.forall(init.contains(_))))
  }

//  "group() method" should "Group the elements of a set into disjoint subsets" in {
//    b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.
//    val init = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
//    val k = 3
//    val res = P27.group(k, init)
//    assert(res.length == 20)
//    assert(res.forall(_.length == k))
//    assert(res.forall(_.forall(init.contains(_))))
//  }

}

