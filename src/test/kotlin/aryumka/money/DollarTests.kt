package aryumka.money

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class DollarTests: FunSpec({
  context("Dollar can be added") {
    test("Dollar(5) + Dollar(5) = Dollar(10)") {
      val dollar1 = Dollar(5)
      val dollar2 = Dollar(5)
      dollar1 + dollar2 shouldBe Dollar(10)
    }
  }

  context("Dollar can be compared by value") {
    test("Dollar(5) == Dollar(5)") {
      val dollar1 = Dollar(5)
      val dollar2 = Dollar(5)
      dollar1 shouldBe dollar2
    }

    test("Dollar(5) != Dollar(6)") {
      val dollar1 = Dollar(5)
      val dollar2 = Dollar(6)
      dollar1 shouldNotBe dollar2
    }

    test("Dollar(5) != 5") {
      val dollar = Dollar(5)
      dollar shouldNotBe 5
    }
  }
})
