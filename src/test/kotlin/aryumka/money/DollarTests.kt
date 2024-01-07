package aryumka.money

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DollarTests: FunSpec({
  context("Dollar can be added") {
    test("Dollar(5) + Dollar(5) = Dollar(10)") {
      val dollar1 = Dollar(5)
      val dollar2 = Dollar(5)
      dollar1 + dollar2 shouldBe Dollar(10)
    }
  }
})
