package chapterTwo

import chapterTwo.ArrayVerifier.isSorted
import org.scalatest.FunSuite

class ArrayVerifierTest extends FunSuite {

  test("Test Array is ordered") {
    val orderedArray = Array(-5, 0, 1, 2, 5, 100)
    assert(isSorted[Int](orderedArray, (x, y) => x <= y))
  }

  test("Test Array is not ordered") {
    val orderedArray = Array(-100, 0, 1, 50, 2, 5, 100)
    assert(!isSorted[Int](orderedArray, (x, y) => x <= y))
  }
}
