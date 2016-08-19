package com.example

import scala.util.Random

object Hello {
  def main(args: Array[String]): Unit = {
    val date = args.head
    println(s"${date}のトピックの検索を行っています...")

    (1 to 100).map { i =>
      Thread.sleep(100 * Random.nextInt(5))
      println("working... " + i + "%\r")
    }
    println("done")
    println("5件の新着情報があります")
    println("確認しますか？: y or n")

    val s = io.StdIn.readLine()
    if (s == "y") {
      scala.sys.process.Process("open file:$(pwd)/happy_birthday.pdf -a /Applications/Safari.app").run()
    }
  }
}
