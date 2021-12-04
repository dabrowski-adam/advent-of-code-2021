package com.adamdabrowski.adventofcode

import com.adamdabrowski.adventofcode.day1.solve

import scala.io.Source

@main def run(): Unit =
  println(solve(Source.fromResource("day1/input.txt")))
