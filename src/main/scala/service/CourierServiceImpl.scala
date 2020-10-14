package service

import java.util

import akka.actor.ActorSystem
import akka.event.jul.Logger
import akka.stream.SystemMaterializer
import courier.{CourierService, Path, Paths, StartingCity}
import graph._

import scala.concurrent.Future
class CourierServiceImpl(implicit system: ActorSystem)extends CourierService {

  val random = scala.util.Random
  val logg = Logger("courier")
  implicit val mat = SystemMaterializer(system).materializer
  implicit val exec = mat.executionContext
  val helper = Helper
  helper.init

  override def findPath(in: StartingCity): Future[Path] = {

    println(s"WOW ${in.city1} <->  ${in.city2}" )

    val result: util.List[String] = helper.graph.shortestPath(in.city1.toLowerCase, in.city2.toLowerCase)
    val distance = helper.getDistance(result)

    println(s"RESULT $result")

    Future {  Path(result.toString,distance)  }

  }



}
