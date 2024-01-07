package aryumka.money

class Dollar(
  val amount: Int
) {
  operator fun plus(dollar: Dollar): Dollar {
    return Dollar(amount + dollar.amount)
  }

  override fun equals(other: Any?): Boolean {
    if (other is Dollar) {
      return amount == other.amount
    }
    return false
  }
}
