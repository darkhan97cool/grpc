import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.SystemMaterializer
import courier.CourierServiceHandler

object Main extends App {

  implicit  val system = ActorSystem("courier")
  implicit val mat = SystemMaterializer(system).materializer
  Http().bindAndHandleAsync(
    CourierServiceHandler(new service.CourierServiceImpl()),
    interface = "127.0.0.1",
    port = 8082
  )

  println("Server started at 8082")

}
