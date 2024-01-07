package aryumka.money

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class MoneyTests: FunSpec({
  context("Money can be added") {
    test("Money(USD, 5) + Money(USD, 5) = Money(USD, 10)") {
      val money1 = Money(USD, 5)
      val money2 = Money(USD, 5)
      money1 + money2 shouldBe Money(USD, 10)
    }
  }

  context("Money can be compared by value") {
    test("Money(USD, 5) == Money(USD, 5)") {
      val money1 = Money(USD, 5)
      val money2 = Money(USD, 5)
      money1 shouldBe money2
    }

    test("Money(USD, 5) != Money(CHF, 5)") {
      val money1 = Money(USD, 5)
      val money2 = Money(CHF, 5)
      money1 shouldNotBe money2
    }

    test("Money(USD, 5) != Money(USD, 6)") {
      val money1 = Money(USD, 5)
      val money2 = Money(USD, 6)
      money1 shouldNotBe money2
    }

    test("Money(USD, 5) != 5") {
      val money = Money(USD, 5)
      money shouldNotBe 5
    }
  }
})
