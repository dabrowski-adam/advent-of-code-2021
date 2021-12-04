package com.adamdabrowski.adventofcode

import com.adamdabrowski.adventofcode.day1.{solve, solveHalfway}

import scala.io.Source

@main def run(): Unit = {
  println(solveHalfway(Source.fromResource("day1/input.txt")))
  println(solve(Source.fromResource("day1/input.txt")))
}
