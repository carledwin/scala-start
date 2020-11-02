package lectures.part1.basics

object DefaultArgs extends App {

  def trFact(n:Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFact(n -1, n * acc)

  val fact10 = trFact(10, 1)
  println(fact10)

  val fact10Def = trFact(10)
  println(fact10Def)

  val fact10Acc2 = trFact(10,2)
  println(fact10Acc2)

  def savePicture(format: String, width:Int, height: Int): Unit = println("Saving picture")
  def savePictureDef(format: String = "png", width:Int = 800, height: Int = 600): Unit = println("Saving picture")
  savePicture("jpg", 123, 64)
  savePictureDef("jpg", 123, 64)
  savePictureDef(width=123, height = 64)
  savePictureDef("jpg")
  savePictureDef(height = 64, width=123, format = "git")

}
