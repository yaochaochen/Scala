package com.yc.dev.case1

object Case2_for {

  def main(args: Array[String]): Unit = {
    for (a <- 1.to(10,2)) {
      println("Value of a:" +a)
    }
    println("*"*20)

    for (a <- 1 to 10) {
      println("Value of a :" +a)
    }
    println("*" *20)
  }
  for(a <- 2 until(2)) {
    println("value of a:"+ a)
  }
  println("*"*20)
  val numList = List(1,2,3,4,5,6,7,8,9,10)
  numList.foreach(x =>{
    println(x)
  })
  println("*" *20)
  numList.filter(_>= 5).foreach(println)
  println("*" *20)

  val newList = for (a <- numList; if a != 3; if a < 8) yield a
  newList.foreach(println)
  val a = List(1,1,1,1,5,6,7,8,9,10)
  a.filter(x => x == a.head).foreach(println)
}
