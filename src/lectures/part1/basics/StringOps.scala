package lectures.part1.basics

object StringOps extends App {

  val str: String = "Hello, Im a learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase)
  println(str.length)

  val aNumberString = "2"
  val ANumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z' )
  println(str.reverse)
  println(str.take(2))

  println("Scala-specifc: String interpolators.")
  println("S-Interpolators")

  val name = "Nataly"
  val age = 10
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."

  println(greeting)
  println(anotherGreeting)

  println("F-Interpolators " +
    "\n is similar to printf or \n" +
    " * f interpolated formatted string \n" +
    " * $ will expand value \n" +
    " * %S string \n" +
    " * %2.2f float number format with 2 characters total minimum 2 decimals precision \n")
  val speed = 1.2f
  val myth = f"$name%S can eat $speed%2.2f burgers per minute"

  println(myth)

  println("Raw - Interpolator \n")
  println(raw"This is a \n newline")

  val escaped = "This is a \n new line"
  println(escaped)
  println(raw"escaped")
  println(raw"$escaped")
}
