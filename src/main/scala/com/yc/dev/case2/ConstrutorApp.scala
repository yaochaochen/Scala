package com.yc.dev.case2

object ConstructorApp {

  def main(args: Array[String]): Unit = {
    val person = new Person("zhangsan", 30)
    println(person.name + ":" + person.age)

    val person1 = new Person("zhangsan", 30,"M")
  }

}
//主构造器
class  Person(val name:String, val age:Int ) {
  println("Person is a Constructor enter")

  val school = "ustc"
  var gender:String = _

  //附属构造器
  def this(name:String, age:Int, gender:String) {
    this(name, age)// 附属构造器的第一行代码必须要调用主构造器或者其他附属构造器
    this.gender = gender
  }
  println("Person Constructor leave.....")

}

class  Student(name:String,age:Int, var mojor:String) extends Person(name,age ) {
  println("Person Student enter")
  override val school: String = "Pek"

  override def toString: String = "Person:" +school

}


