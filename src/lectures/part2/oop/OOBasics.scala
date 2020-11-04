package lectures.part2.oop

object OOBasics extends App {

  val person = new Person("carl edwin", 37)
  println(person.age)
  person.greet("Ana")
  person.greet()

  val person2 = new Person("Karan")
  println(person2.greet())

  val person3 = new Person()
  println(person3.greet())

  val writer = new Writer("Carl", "Edwin", 1812)
  val imposterWriter = new Writer("Çasles", "TTesns", 1812)
  writer.fullname()

  val novel = new Novel("É lindo o amor", 1861, writer)

  println(novel.authorAge)
  println(novel.isWrittenBy(writer))
  println(novel.isWrittenBy(imposterWriter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print

}

class Writer(val firstname: String, surname:String, val year:Int){
  def fullname():Unit = println(s"$firstname $surname")
}

class Novel(name:String, year:Int, author:Writer){
  def authorAge = year - author.year
  def isWrittenBy(author:Writer):Boolean = author == this.author
  def copy(newYear:Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count:Int =0){

  def inc = {
    println("Increment")
    new Counter(count + 1)
  }//immutability

  def dec = {
    println("Decrement")
    new Counter(count - 1)
  }//immutability

  def inc(n: Int):Counter =
    if(n <= 0) this
    else inc.inc(n - 1)

  def dec(n:Int):Counter =
    if(n <= 0) this
    else inc.dec(n - 1)

  def print = println(count)
}


//constructor
class Person(name:String, val age:Int){

  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi: $name")

  def greet(): Unit = println(s"Hi, Im am $name") //similar that this.name overloading

  //multiple constructors
  def this(name:String) = this(name, 0)

  def this() = this("Leirn")
}
