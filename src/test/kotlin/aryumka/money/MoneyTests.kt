package aryumka.money

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import aryumka.money.Money.Currency.*

class MoneyTests: FunSpec({
  context("Money can be added") {
    test("Money(USD, 5) + Money(USD, 5) = Money(USD, 10)") {
      val money1 = Money(USD, 5)
      val money2 = Money(USD, 5)
      money1 + money2 shouldBe Money(USD, 10)
    }
  }

  context("Money can be multiplied") {
    test("Money(USD, 5) * Money(USD, 2) = Money(USD, 10)") {
      val money1 = Money(USD, 5)
      val money2 = Money(USD, 2)
      money1 * money2 shouldBe Money(USD, 10)
    }
  }

  context("Money can be divided") {
    test("Money(USD, 10) / Money(USD, 2) = Money(USD, 5)") {
      val money1 = Money(USD, 10)
      val money2 = Money(USD, 2)
      money1 / money2 shouldBe Money(USD, 5)
    }
  }

  context("Money can be subtracted") {
    test("Money(USD, 10) - Money(USD, 5) = Money(USD, 5)") {
      val money1 = Money(USD, 10)
      val money2 = Money(USD, 5)
      money1 - money2 shouldBe Money(USD, 5)
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

    test("Money(USD, 5) < Money(USD, 6)") {
      val money1 = Money(USD, 5)
      val money2 = Money(USD, 6)
      money1 < money2 shouldBe true
    }

    test("Money(USD, 5) > Money(USD, 6)") {
      val money1 = Money(USD, 5)
      val money2 = Money(USD, 6)
      money1 > money2 shouldBe false
    }

    test("Money(USD, 5) <= Money(USD, 6)") {
      val money1 = Money(USD, 5)
      val money2 = Money(USD, 6)
      money1 <= money2 shouldBe true
    }
  }
})
