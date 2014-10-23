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
      List.setHead(List(1, 2, 3), 4) must beEqualTo(List(4, 2, 3))
    }
    "drop the first n items in a list" in {
      List.drop(List(1, 2, 3), 2) must beEqualTo(List(3))
    }
    "drop elements in a list that match a predicate" in {
      List.dropWhile(List(1, 2, 3, 4), (i: Int) => i < 3) must beEqualTo(List(3, 4))
    }
    "get all but the last element of a list" in {
      List.init(List(1, 2, 3, 4)) must beEqualTo(List(1, 2, 3))
    }
    "get the length of a list" in {
      List.length(List(1, 2, 3, 4)) must beEqualTo(4)
    }
    "foldLeft a List" in {
      List.foldLeft(List(1, 2, 3, 4), "")((acc, nextInt) => acc + nextInt.toString) must beEqualTo("1234")
    }
    "3.11 Implement product, sum and length in foldLeft" in {
      List.sum3(List(1, 2, 3, 4)) must beEqualTo(10)
      List.product3(List(1, 2, 3, 4)) must beEqualTo(24)
      List.length2(List(1, 2, 3, 4)) must beEqualTo(4)
    }
    "3.12 Reverse a list with a fold" in {
      List.reverse(List(1, 2, 3, 4)) must beEqualTo(List(4, 3, 2, 1))
    }
    "3.14 Append by folding" in {
      List.appendByFolding(List(1, 2), List(3, 4)) must beEqualTo(List(1, 2, 3, 4))
    }
    "3.15 Concatenate a list of lists into a single list" in {
      List.concatenate(List(List(1, 2), List(3, 4))) must beEqualTo(List(1, 2, 3, 4))
    }
    "3.16 Add one to each element in a list" in {
      List.addOne(List(1, 2, 3, 4)) must beEqualTo(List(2, 3, 4, 5))
    }
    "3.17 Convert Double to String" in {
      List.doubleToString(List(1.0, 2.0, 3.0, 4.0)) must beEqualTo(List("1.0", "2.0", "3.0", "4.0"))
    }
    "3.18 Implement map" in {
      List.map(List(1.0, 2.0, 3.0, 4.0))((x) => x.toString) must beEqualTo(List("1.0", "2.0", "3.0", "4.0"))
    }
    "3.19 Filter out elements from a list that do not satisfy a predicate" in {
      List.filter(List(1, 2, 3, 4))((n) => (n % 2) == 0) must beEqualTo(List(2, 4))
    }
    "3.20 Flatmap" in {
      List.flatMap(List(1, 2, 3))(i => List(i, i)) must beEqualTo(List(1, 1, 2, 2, 3, 3))
    }
  }
}