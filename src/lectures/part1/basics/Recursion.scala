package lectures.part1.basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n:Int): Int =
    if(n <= 1) 1
    else {
      print("Computing factorial of " + n + " - I first need factorial of " + (n -1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
  //println(factorial(5000)) crash - StackOverFlowError


  def anotherFactorial(n:Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if(x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //tail recusion = use recursive call as the last expression

    factHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factHelper(10, 1)
  = factHelper(9, 10 * 1)
  = factHelper(8, 9 * 10 * 1)
  = factHelper(7, 8 * 9 * 10 * 1)
  = factHelper(6, 7 * 8 * 9 * 10 * 1)
  = ...
  = factHelper(2, * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  = factHelper(1, 1 * 2 * 4 * 5 * 6 * 7 * 8 * 9 * 10)
  = 1 * 2 * 3... * 10
   */

  println("AnotherFactorial -----------------------")
  println(anotherFactorial(20000))
  //when you need loops, user_tail_recursion
  /*
  1. concatenate a string n times
  2. isPrime fucntion tail recursion
  3. fibonacci function, tail recursive
   */

  @tailrec
  def concatenateTailRec(aString:String, n:Int, accumulator:String): String =
    if(n <= 0) accumulator
    else concatenateTailRec(aString, n - 1, aString + accumulator)

  println(concatenateTailRec("Hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t:Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n /2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  def fibonacciTailRec(n: Int): Int =
    if(n <= 2) 1
    else fibonacciTailRec(n -1) + fibonacciTailRec(n - 2)

  def fibonacci(n:Int): Int = {
    @tailrec
    def fibonacciTailrec(i:Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fibonacciTailrec(i + 1, last + nextToLast, last)

    if(n <= 2) 1
    else fibonacciTailrec(2, 1, 1)
  }


  println("Fibonacci TailRec -----------------")
  println(fibonacciTailRec(6))
  println(fibonacci(6))
  println(fibonacci(8))
  println(fibonacci(10))


}
