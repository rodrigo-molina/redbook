package chapterTwo

import chapterTwo.Curry.{compose, curry, unCurry}
import org.scalatest.FunSuite

class CurryTest extends FunSuite {

  test("Curry test") {
    def func(x: Int, y: Int): Int = x + y

    val addOne = curry(func)(1)
    val addTen = curry(func)(10)

    assert(addOne(5) === 6)
    assert(addTen(5) === 15)
  }

  test("Uncurry test") {
    def func(x: Int, y: Int): Int = x + y

    def curried(a: Int): Int => Int = curry(func)(1)

    def unCurried = unCurry(curried);

    assert(unCurried(1, 5) === 6)
  }

  test("Compose test") {
    def multiplyByTwo(a: Int): Int = a * 2

    def prettyString(a: Int): String = s"Pretty Int: $a"

    val multiplyByTwoAndPrettyString = compose(prettyString, multiplyByTwo)

    assert(multiplyByTwoAndPrettyString(7) === "Pretty Int: 14")
  }


}
