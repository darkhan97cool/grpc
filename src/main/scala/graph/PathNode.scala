package graph


class PathNode(var name: String, var parent: String,var distance2root: Int) extends Comparable[PathNode] {
  override def compareTo(another: PathNode): Int = distance2root - another.distance2root
}
