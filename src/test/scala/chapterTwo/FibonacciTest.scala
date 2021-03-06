package chapterTwo

import chapterTwo.ArrayVerifier.isSorted
import org.scalatest.FunSuite

class FibonacciTest extends FunSuite {

  val expectedSeries = List(0, 1, 1, 2, 3, 5, 8, 13, 21)

  expectedSeries.zipWithIndex.foreach { i =>
    test(s"Fibonacci of ${i._2 + 1} is ${i._1}") {
      assert(Fibonacci.series(i._2 + 1) === i._1)
    }
  }

  expectedSeries.zipWithIndex.foreach { i =>
    test(s"Fibonacci TailRec Implementation of ${i._2 + 1} is ${i._1}") {
      assert(Fibonacci.seriesTailRec(i._2 + 1) === i._1)
    }
  }

  test("Illegal argument when parameter is not a natural number") {
    assertThrows[IllegalArgumentException](Fibonacci.seriesTailRec(0));
    assertThrows[IllegalArgumentException](Fibonacci.seriesTailRec(-1));
  }
}
