package graph

import java.util

import scala.collection.mutable
import scala.io.Source

object Helper {

  val filename = "cities.txt"
  val bufferedSource = Source.fromFile(filename)
  var graphParams: mutable.Map[(String, String), Int] = collection.mutable.Map()

  val graph = new Graph()

  def init {
    for (line <- bufferedSource.getLines) {

      val relation = line.split(',')
      val cities: (String, String) = (relation(0), relation(1))
      graphParams += ((cities -> relation(2).toInt))
      graph.addEdge(cities._1, cities._2, relation(2).toInt)

    }
    bufferedSource.close()
  }

  def getDistance(result: util.List[String]) = {

    var distance = 0
    for (i <- 1 until result.size()) {
      distance += graphParams.getOrElse((result.get(i - 1), result.get(i)), 0)
      println(s"${result.get(i - 1)} <-> ${result.get(i)}   -- Distance => " + distance)
    }
    distance

  }


}
