package com.yc.dev.case2

object AbstractApp {
  def main(args: Array[String]): Unit = {
      val student = new Student2()
      println(student.name)
      student.speak
  }
}
abstract class Person2 {
  def speak
  val name: String
  val age: Int

}

class Student2 extends Person2 {
  override def speak: Unit = {
    println("speak")
  }

  override val name: String = "YCC"
  override val age: Int = 18
}
