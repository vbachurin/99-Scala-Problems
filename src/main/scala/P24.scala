package org.p99.scala

import scala.util.Random

object P24 {

  def lotto(cnt: Int, m: Int) = List.fill(cnt)(Random.nextInt(m))

}
