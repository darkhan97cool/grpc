package graph

import scala.collection.mutable

class Node(var name: String) {
  // key: neighbor; value: distance from this node to the neighbor
  val neighbors:mutable.HashMap[Node, Integer] = mutable.HashMap()


  def addNeighbor(neighbor: Node, distance: Int): Unit = {
    neighbors.put(neighbor, distance)
  }

  def getNeighbors: Array[Node] = {
    val result = neighbors.keys.toArray//new Array[graph.Node](neighbors.size)
    //    neighbors.keys.toArray
    result
  }

  def getNeighborDistance(node: Node): Int = neighbors(node)


  override def hashCode: Int = name.hashCode

  override def equals(another: Any): Boolean = name == another.asInstanceOf[Node].name
}