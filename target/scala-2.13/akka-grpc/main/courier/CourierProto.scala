// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package courier

object CourierProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      courier.StartingCity,
      courier.Path,
      courier.Paths
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Cg1jb3VyaWVyLnByb3RvEgdjb3VyaWVyIlIKDFN0YXJ0aW5nQ2l0eRIgCgVjaXR5MRgBIAEoCUIK4j8HEgVjaXR5MVIFY2l0e
  TESIAoFY2l0eTIYAiABKAlCCuI/BxIFY2l0eTJSBWNpdHkyIkcKBFBhdGgSHQoEcGF0aBgBIAEoCUIJ4j8GEgRwYXRoUgRwYXRoE
  iAKBXZhbHVlGAIgASgNQgriPwcSBXZhbHVlUgV2YWx1ZSI1CgVQYXRocxIsCgRwYXRoGAEgAygLMg0uY291cmllci5QYXRoQgniP
  wYSBHBhdGhSBHBhdGgyRAoOQ291cmllclNlcnZpY2USMgoIRmluZFBhdGgSFS5jb3VyaWVyLlN0YXJ0aW5nQ2l0eRoNLmNvdXJpZ
  XIuUGF0aCIAYgZwcm90bzM="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}