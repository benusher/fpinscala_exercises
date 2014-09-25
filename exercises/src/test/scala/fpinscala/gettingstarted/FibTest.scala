package fpinscala.gettingstarted

class FibTest extends org.specs2.mutable.Specification {

  "A fibonacci sequence" should {
    "be correct" in {
      MyModule.fib(0) must beEqualTo(0)
      MyModule.fib(1) must beEqualTo(1)
      MyModule.fib(2) must beEqualTo(1)
      MyModule.fib(3) must beEqualTo(2)
      MyModule.fib(4) must beEqualTo(3)
      MyModule.fib(5) must beEqualTo(5)
      MyModule.fib(6) must beEqualTo(8)
      MyModule.fib(7) must beEqualTo(13)
      MyModule.fib(8) must beEqualTo(21)
    }
  }
}
