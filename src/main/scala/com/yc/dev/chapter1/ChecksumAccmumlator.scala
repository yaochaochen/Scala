package com.yc.dev.chapter1

/**
  * 类和对象
  * 在Scala中对象方法除了使用object 而非class关键字和类定义非常像
  */
object ChecksumAccmumlator {

  private var cache = Map[String, Int]()
  def calculate(s:String) :Int =
    if (cache.contains(s)){
      cache(s)
    }else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
        val cs = acc.checksum()
        cache += (s -> cs)
        cs

    }

  /**
    *
    */
}

