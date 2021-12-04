package com.adamdabrowski.adventofcode.day1

import org.scalatest.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.*
import org.scalatest.prop.TableDrivenPropertyChecks.*

class Day1Spec extends AnyFlatSpec with should.Matchers {
  "countDepthIncreases" should "match example" in {
    val measurements = List(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
    countDepthIncreases(measurements) should be(7)
  }

  "countDepthIncreases" should "handle edge cases" in {
    val edgeCases = Table(
      ("measurements", "depth increases"),
      (List(), 0),
      (List(42), 0)
    )
    forAll(edgeCases) { case (measurements, expected) =>
      countDepthIncreases(measurements) should be(expected)
    }
  }
}
