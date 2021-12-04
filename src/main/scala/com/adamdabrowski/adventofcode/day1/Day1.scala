package com.adamdabrowski.adventofcode.day1

import scala.io.Source

val parseInput: Source => List[Int] =
  _.getLines.map(_.toInt).toList

val countDepthIncreases: List[Int] => Int =
  _
    .sliding(2, 1)
    .toList
    .map({ case List(x, y) => x < y case _ => false }) // https://www.scala-lang.org/old/node/7939
    .count(_ == true)

val solve: Source => Int =
  parseInput andThen countDepthIncreases
