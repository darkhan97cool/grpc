package graph


import java.util
import java.util.PriorityQueue

import scala.collection.mutable

class Graph() {
  private val nodes:mutable.HashMap[String, Node] = mutable.HashMap()

  def addEdge(nodeName1: String, nodeName2: String, weight: Int): Unit = {

    var node1: Node = null
    try{
      node1 = nodes(nodeName1)
    }
    catch{
      case e:Exception => println(s"$e")
    }
    if (node1 == null) node1 = new Node(nodeName1)

    var node2:Node = null
    try {
      node2 = nodes(nodeName2)
    }
    catch{
      case e:Exception => println(s"$e")
    }
    if (node2 == null) node2 = new Node(nodeName2)
    node1.addNeighbor(node2, weight)
    node2.addNeighbor(node1, weight)
    nodes.put(nodeName1, node1)
    nodes.put(nodeName2, node2)
  }

  def shortestPath(startNodeName: String, endNodeName: String): util.List[String] = { // key node, value parent
    val parents:mutable.HashMap[String, String] = mutable.HashMap()
    val visited:mutable.Set[String] = mutable.Set()
    val temp:PriorityQueue[PathNode] = new PriorityQueue[PathNode]()
    val start = new PathNode(startNodeName, null, 0)
    temp.add(start)
    while ( {
      temp.size > 0
    }) {
      val currentPathNode: PathNode = temp.remove
      if (!visited.contains(currentPathNode.name)) {
        val currentNode: Node = nodes(currentPathNode.name)
        parents.put(currentPathNode.name, currentPathNode.parent)
        visited.add(currentPathNode.name)

        if (currentPathNode.name == endNodeName) return getPath(parents, endNodeName) // return the shortest path
        val neighbors = nodes(currentPathNode.name).getNeighbors
        for (i <- neighbors.indices) {
          val neighbor = neighbors(i)
          val distance2root = currentPathNode.distance2root + currentNode.getNeighborDistance(neighbor)

          temp.add(new PathNode(neighbor.name, currentPathNode.name, distance2root))
        }
        System.out.println("current node: " + currentPathNode.name)
        System.out.println("PriorityQueue: " + temp)
        System.out.println("Parents: " + parents)
        System.out.println("Visited: " + visited)
        System.out.println("")
      }
    }
    null
  }

  def getPath(parents: mutable.HashMap[String, String], endNodeName: String): util.ArrayList[String] = {
    val path = new util.ArrayList[String]
    var node = endNodeName
    while ( {
      node != null
    }) {
      path.add(0, node)
      val parent: String = parents(node)
      node = parent
    }
    path
  }
}


