object MoneyChange {

  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (coins.nonEmpty && money > 0)
    // (if not use this coin) + (use this coin)
      countChange(money, coins.tail) + countChange(money - coins.head, coins)
    // if coins is empty or money < 0
    else 0
  }
}