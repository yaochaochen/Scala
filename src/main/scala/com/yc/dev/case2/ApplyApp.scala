package com.yc.dev.case2

object ApplyApp {

  def main(args: Array[String]): Unit = {
    val b = ApplyTest() // ==> Object.apply

    println("~~~~~~~~~~~")
    val c = new ApplyTest()
    println(c)
    c()
  }

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
