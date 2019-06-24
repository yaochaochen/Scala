package com.yc.dev.case3

import  scala.collection.mutable
object MapApp extends App {
  val a = Map("PK" -> 18, "zhangsan" -> 30)
  val b = Map("Pk" -> 18, "zhangsan" -> 30)
  val c = mutable.HashMap[String, Int]()
  b.getOrElse("Pk", 18)

  for((key,value) <- b) {
    println(key +":" +value + ":" + b.getOrElse("Pk", 10))

  }


}
