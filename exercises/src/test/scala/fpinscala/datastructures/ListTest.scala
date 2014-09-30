package fpinscala.datastructures

import org.specs2.mutable.Specification

class ListTest extends Specification {

  "A list" should {
    "can return the tail of a list" in {
      List.tail(List(1, 2, 3)) must beEqualTo(List(2, 3))
    }
    "tail is Nil if list is Nil" in {
      List.tail(Nil) must beEqualTo(Nil)
    }
    "replace the head" in {
      List.setHead(List(1, 2, 3), 4) should beEqualTo(List(4, 2, 3))
    }
  }
}
