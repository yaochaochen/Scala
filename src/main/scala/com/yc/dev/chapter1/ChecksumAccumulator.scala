package com.yc.dev.chapter1

/**
  * Scala 是一个面向对象编程语言
  * 支持函数化编程
  *
  */
class ChecksumAccumulator {
  private var sum = 0;
  def add(b:Byte):Unit = sum += b

  def checksum() : Int = ~(sum & 0xFF) +1

  /**
    * 总结：
    * Scala和Java很类似，也是class开始 和Java不同的 Scala的缺省修饰符为public.也就是如果不带访问范围的修饰符
    * 类的定义都是def定义开始 要注意Scala方法的参数都是val类型，而不是var类型 因此在函数体内不可以修饰参数的值
    * def add(b:Int) : Unit = {
    * b = 1
    * sum+=b
    * }
    * 会报错的
    * 方法体有返回值和不含返回值 Unit 等同于 Java的void
    *
    */

}
