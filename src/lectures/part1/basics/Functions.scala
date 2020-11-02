package lectures.part1.basics

object Functions extends App {

  def aFuntion(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFuntion("hello", 3))


  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, aInt: Int): String = {

    println("aInt: " + aInt)

    println("Passou a " + aInt)

    if(aInt == 1) aString else aString + aRepeatedFunction(aString, aInt-1)
  }

  println(aRepeatedFunction("hello", 3))

  //when you need loops, use recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {

    def aSmallerFunction(a:Int, b:Int):Int = a + b
    aSmallerFunction(n, n-1)
  }

  /*
   * 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
   * 2. Factorial function 1* 2* 3 * .. * n
   * 3. A Fibonacci function
   *  f(1) = 1
   *  f(2) = 2
   *  f(n) = f(n - 1) + f(n - 2)
   * 4. Tests if a number is prime
   */

  def greetingForKids(name:String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."
    println(greetingForKids("Carl Edwin", 37))

  def fatorial(n:Int): Int =
    if(n <= 0) 1 else n * fatorial(n - 1)

  println(fatorial(5)) //120


  def fibonacci(position: Int): Int =
    if(position == 1 || position == 2) 1
    else fibonacci(position - 1) + fibonacci(position - 2)


  def f1(n: Int): Int =
    if(n == 1 || n == 2) 1
    else f1(n - 1) + f1(n - 2)

  def f2(n: Int): Int =
    if(n <= 2) 1
    else f2(n - 1) + f2(n - 2)

  println(f1(3))

  println(f2(3))

  println("Super Fibonacci ----------------- \n")
  println(fibonacci(1))
  println(fibonacci(2))
  println(fibonacci(3))
  println(fibonacci(4))
  println(fibonacci(5))
  println(fibonacci(6))
  println(fibonacci(7))
  println(fibonacci(8))
  println(fibonacci(9))
  println(fibonacci(10))
  println(fibonacci(11))
  println(fibonacci(12))

  println("Prime Numbers ------------------\n")
  def isPrimeNumber(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrimeNumber(37))
  println(isPrimeNumber(2003))
  println(37 * 17)
  println(isPrimeNumber(37 * 17))

}
