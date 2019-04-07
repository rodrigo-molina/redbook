package chapterTwo

import com.sun.javaws.exceptions.InvalidArgumentException

object Fibonacci {

  def series(number: Int): Int =
    number match {
      case x if x < 0 => throw new IllegalArgumentException()
      case 1 => 0
      case 2 => 1
      case _ => series(number - 2) + series(number - 1)
    }
}
