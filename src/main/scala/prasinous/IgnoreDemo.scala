package prasinous

import com.novus.salat._
import com.novus.salat.global._
import com.mongodb.casbah.Imports._

object IgnoreDemo {
  def main(args: Array[String]) {
    val t = Test2("test", "test2")
    val dbo = grater[Test2].asDBObject(t)
    println(dbo)
  }
}
