package aryumka.money

class Money(
  val currency: Currency,
  val amount: Int
) {
  operator fun plus(money: Money): Money {
    if (this.currency != money.currency) {
      throw IllegalArgumentException("currency is different")
    }
    return Money(this.currency, this.amount + money.amount)
  }

  operator fun times(money: Money): Money {
    if (this.currency != money.currency) {
      throw IllegalArgumentException("currency is different")
    }
    return Money(this.currency, this.amount * money.amount)
  }

  operator fun div(money: Money): Money {
    if (this.currency != money.currency) {
      throw IllegalArgumentException("currency is different")
    }
    return Money(this.currency, this.amount / money.amount)
  }

  operator fun minus(money: Money): Money {
    if (this.currency != money.currency) {
      throw IllegalArgumentException("currency is different")
    }
    return Money(this.currency, this.amount - money.amount)
  }

  override fun equals(other: Any?): Boolean {
    if (other is Money) {
      return this.currency == other.currency && this.amount == other.amount
    }
    return false
  }

  enum class Currency {
    USD,
    CHF
  }
}
