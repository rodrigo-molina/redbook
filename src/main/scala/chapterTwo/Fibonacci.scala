package chapterTwo

object Fibonacci {

  def series(number: Int): Int =
    number match {
      case x if x < 1 => throw new IllegalArgumentException()
      case 1 => 0
      case 2 => 1
      case _ => series(number - 2) + series(number - 1)
    }


  def seriesTailRec(number: Int): Int = {

    @annotation.tailrec
    def loop(beforeBefore: Int, before: Int, remainsIterate: Int): Int =
      if (remainsIterate == 0) before
      else loop(before, beforeBefore + before, remainsIterate - 1)

    number match {
      case x if x < 1 => throw new IllegalArgumentException()
      case 1 => 0
      case 2 => 1
      case _ => loop(0, 1, number - 2)
    }
  }

}
