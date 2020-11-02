package lectures.part1.basics

object ValuesVariablesTypes extends App{

  // vals are immutable
  val asi: Int = 42
  println(asi)

  //compiler can infer types
  val i = 56
  println(i)

  val s = "string"
  println(s)

  val ass:String = "asString"
  println(ass)

  val b = false
  println(b)

  val asb:Boolean = true
  println(asb)

  val c = 'c'
  println(c)

  val asc:Char = 'Ç'

  val sh = 3232
  println(sh)

  val assh:Short = 6565
  println(assh)

  val l = 3343434343434l
  println(l)

  val asl:Long = 645454545454544l

  val f = 2.43f
  println(f)

  val asf:Float = 3.45f
  println(asf)

  val d = 55454.4d
  println(d)

  val asd = 34344444.44d
  println(asd)

//=====================================

  var message = "Hello"
  println(message)

  message = "Hello World"
  println(message)


}