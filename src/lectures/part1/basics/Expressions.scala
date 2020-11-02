package lectures.part1.basics

object Expressions extends App {

  val x = 1 + 2 //expression
  println(x)

  println(2 + 3 * 4) // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  //instructions (DO) vs Expressions

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  println("While")

  var i = 0
  val aWhile = while(i < 10){
    print(i + ", ")
    i += 1
  }

  println("")

  //never write this again

  //everthing in Scala is an Expression !

  val aWeirdValue = (aVariable = 3) //Unit === void
  println(aWeirdValue)


  //side effects: println(), while, reassigning

  //code block

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"
  }

  val xx = 3 + 5
  val xxIsEven = x % 2 == 0
  val xxIsOdd = !xxIsEven

  val cond : Boolean = 42 == (21 + 21)
  val a42 = if (cond) 42 else 0


  //Code blocks In Scala are expressions
  val xxx = {
    val cond: Boolean = 42 == (21 + 21)
    if(cond) 42 else 0
  }

  //do not use while loops in your Scala code or I'll haunt you

  val someValue = {
    2 < 3
  }

  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someOtherValue)










}
