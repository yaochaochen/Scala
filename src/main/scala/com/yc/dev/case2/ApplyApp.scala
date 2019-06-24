package com.yc.dev.case2

object ApplyApp {

  def main(args: Array[String]): Unit = {
    val b = ApplyTest() // ==> Object.apply

    println("~~~~~~~~~~~")
    val c = new ApplyTest()
    println(c)
    c()
  }

  /**
    * 伴生类和伴生对象
    * 如果有一个class，还有一个与class同名的object
    * 那么就称这个object是class的伴生对象，class是object的伴生类
    */
  class ApplyTest{
    def apply() = {
      println("class ApplyTest apply....")
    }
  }
  object ApplyTest {
    println("Object ApplyTest........")
    var count = 0
    def  incr = {
      count = count + 1
    }

    def apply() : ApplyTest = {
      println("Object ApplyTest apply....")
      new ApplyTest
    }
    println("Object ApplyTest leave......")
  }


}
