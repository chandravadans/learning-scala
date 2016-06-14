/**
  * Created by cv on 6/14/16.
  */
class SqrtNewton extends App {

  def abs(number: Double): Double = {
    if (number < 0)
      -number
    else
      number
  }

  def sqrt(number: Double): Double = {

    def sqrtHelper(guess: Double, number: Double): Double = {
      if (isGoodEnough(guess, number))
        guess
      else
        sqrtHelper(improve(guess, number), number)

    }

    def improve(guess: Double, number: Double): Double = {
      (guess + number / guess) / 2
    }

    def isGoodEnough(guess: Double, number: Double): Boolean = {
      abs(guess * guess - number) / number < 0.001
    }


    sqrtHelper(1.0, number)
  }

}
