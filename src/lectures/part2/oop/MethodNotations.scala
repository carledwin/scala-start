package lectures.part2.oop

object MethodNotations extends App {

  class Person(val name:String, favoriteMovie:String){
    def likes(movie:String):Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"//permissive
    def unary_! : String= s"$name, what the heck?!"
    def isAlive: Boolean = true //sugar method
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
    println(mary.likes("Inception"))
    println(mary likes("Inceptions"))//equivalent
    println(mary likes "Inception")
  //infix notation = operator notation (syntactic sugar)

  //"operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary.hangOutWith(tom))
  println(mary hangOutWith tom)//equivalent
  println(mary.+(tom))//permissive
  println(mary + tom)//equivalent

  println(mary unary_!)//equivalent
  println(mary.unary_!)//equivalent
  println(!mary)//equivalent


  println( 1 + 2)
  println(5.+(3))
  println(20./(3))
  println(18.-(1))
  println(5.*(5))
  //all operators are methods.
  //akka actores have ! ?

  //prefix notation
  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_ prefix only works with - + ~!

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive) //sugar

  //apply
  println(mary.apply())
  println(mary())//equivalent
  println(mary ())//equivalent
  println(mary.apply)//equivalent
  println(mary apply)//equivalent


}
