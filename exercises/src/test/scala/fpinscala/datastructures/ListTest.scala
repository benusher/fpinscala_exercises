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
    "drop the first n items in a list" in {
      List.drop(List(1, 2, 3), 2) should beEqualTo(List(3))
    }
    "drop elements in a list that match a predicate" in {
      List.dropWhile(List(1, 2, 3, 4), (i: Int) => i < 3) should beEqualTo(List(3, 4))
    }
    "get all but the last element of a list" in {
      List.init(List(1, 2, 3, 4)) should beEqualTo(List(1, 2, 3))
    }
    "get the length of a list" in {
      List.length(List(1, 2, 3, 4)) should beEqualTo(4)
    }
  }
}