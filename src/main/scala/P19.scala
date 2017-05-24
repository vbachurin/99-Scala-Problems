package org.p99.scala

object P19 {
  def rotate(n: Int, xs: List[Symbol]) =
    if (n > 0)
      xs.drop(n) ++ xs.take(n)
    else
      xs.takeRight(-n) ++ xs.dropRight(-n)
//    def _rotate(m: Int, acc: List[Symbol], xs: List[Symbol]) = (m, xs) match {
//      case (_, Nil) => acc
//      case (1, h :: t) =>
//    }

//  }


}
