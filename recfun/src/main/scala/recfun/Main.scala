package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1 : Pascal number
    * nth pascal number is the same as c(n,r)
    */
  def pascal(r: Int, n: Int): Int = {
    if (n == r || r == 0)
      1
    else {
      factorial(n) / (factorial(n - r) * factorial(r))
    }
  }

  def factorial(n: Int): Int = {

    def factorialHelper(n: Int, acc: Int): Int = {
      if (n == 1)
        acc
      else
        factorialHelper((n - 1), acc * n)
    }

    if (n == 0)
      1
    else
      factorialHelper(n, 1)
  }


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = ???

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
