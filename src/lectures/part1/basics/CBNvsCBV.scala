package lectures.part1.basics

object CBNvsCBV extends App {

  //call by name vs call by value

  def calledByValue(x: Long): Unit = {
    println("By value 1: " + x)
    println("By value 1: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("By name 1: " + x)
    println("By name 1: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  //x: passed the actual value
  //x: => passed the expression
  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34) //StackOverFlowError
  printFirst(34, infinite()) //seems to survive

}
