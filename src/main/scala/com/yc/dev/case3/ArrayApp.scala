package com.yc.dev.case3

object ArrayApp {
  def main(args: Array[String]): Unit = {
    val c = scala.collection.mutable.ArrayBuffer[Int]()
    c += 1
    c += 2
    c +=(3,4,5)
    c ++= Array(6,7,8)
    c.insert(0,0)
    c.remove(0,3)
    //c.trimEnd(1)
    for(ele <- c){
      println(ele)
    }
    for (i <- ( 0 until c.length).reverse) {
      println(c(i))
    }
  }

}
