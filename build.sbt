name := "grpc"

version := "0.1"

scalaVersion := "2.13.3"

val akkaVersion = "2.5.20"

enablePlugins(AkkaGrpcPlugin)

fork := true

enablePlugins(ParadoxRevealPlugin)
