package aryumka.money

class Money(
  val currency: Currency,
  val amount: Double
) {
  constructor(currency: Currency, amount: Int): this(currency, amount.toDouble())

  // Arithmetic operators
  operator fun plus(money: Money): Money =
    Money(
      if (this.currency == money.currency) this.currency else Currency.USD,
      this.amount * this.currency.exchangeRate + money.amount * money.currency.exchangeRate
    )

  operator fun times(money: Money): Money =
    Money(
      if (this.currency == money.currency) this.currency else Currency.USD,
      (this.amount * this.currency.exchangeRate) * (money.amount * money.currency.exchangeRate)
    )

  operator fun div(money: Money): Money =
    Money(
      if (this.currency == money.currency) this.currency else Currency.USD,
      (this.amount * this.currency.exchangeRate) / (money.amount * money.currency.exchangeRate)
    )

  operator fun minus(money: Money): Money =
    Money(
      if (this.currency == money.currency) this.currency else Currency.USD,
      (this.amount * this.currency.exchangeRate) - (money.amount * money.currency.exchangeRate)
    )

  // Unary operators
  operator fun unaryMinus(): Money =
    Money(
      this.currency,
      -this.amount
    )

  operator fun unaryPlus(): Money =
    Money(
      this.currency,
      +this.amount
    )

  // Comparison operators
  operator fun compareTo(money: Money): Int =
    (this.amount * this.currency.exchangeRate)
      .compareTo(money.amount * money.currency.exchangeRate)


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
