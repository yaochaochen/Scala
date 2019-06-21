package com.yc.dev.chapter1

/**
  * if else语法
  */
object Case_if_else {

  def main(args: Array[String]): Unit = {
    val x =30
    if(x == 10) {
      printf("value of is 10")
    } else if(x == 20){
      printf("value of is 20")
    } else if (x == 30) {
      printf("value of is 30")
    } else {
      printf("This is else statement")
    }

  }


}
