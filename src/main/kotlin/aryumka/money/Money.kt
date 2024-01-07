package aryumka.money

class Money(
  val currency: Currency,
  val amount: Double
) {
  constructor(currency: Currency, amount: Int): this(currency, amount.toDouble())

  // Arithmetic operators
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

  // Comparison operators
  operator fun compareTo(money: Money): Int {
    if (this.currency != money.currency) {
      throw IllegalArgumentException("currency is different")
    }
    return this.amount.compareTo(money.amount)
  }

  // Equality operators
  override fun equals(other: Any?): Boolean {
    if (other is Money) {
      return this.currency == other.currency && this.amount == other.amount
    }
    return false
  }

  override fun toString(): String {
    return "$currency $amount"
  }

  enum class Currency(val exchangeRate: Double) {
    USD(1.0),
    CHF(0.5)
  }
}
