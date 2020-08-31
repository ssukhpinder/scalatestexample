class CubeCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }
    test("CubeCalculator.cube 4 should be 64") {
    assert(CubeCalculator.cube(4) === 64)
  }
}
