// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package courier

@SerialVersionUID(0L)
final case class Path(
    path: _root_.scala.Predef.String = "",
    value: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Path] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = path
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(2, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = path
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = value
        if (__v != 0) {
          _output__.writeUInt32(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withPath(__v: _root_.scala.Predef.String): Path = copy(path = __v)
    def withValue(__v: _root_.scala.Int): Path = copy(value = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = path
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = value
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(path)
        case 2 => _root_.scalapb.descriptors.PInt(value)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = courier.Path
}

object Path extends scalapb.GeneratedMessageCompanion[courier.Path] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[courier.Path] = this
  def merge(`_message__`: courier.Path, `_input__`: _root_.com.google.protobuf.CodedInputStream): courier.Path = {
    var __path = `_message__`.path
    var __value = `_message__`.value
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __path = _input__.readStringRequireUtf8()
        case 16 =>
          __value = _input__.readUInt32()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    courier.Path(
        path = __path,
        value = __value,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[courier.Path] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      courier.Path(
        path = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CourierProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CourierProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = courier.Path(
    path = "",
    value = 0
  )
  implicit class PathLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, courier.Path]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, courier.Path](_l) {
    def path: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.path)((c_, f_) => c_.copy(path = f_))
    def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val PATH_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  def of(
    path: _root_.scala.Predef.String,
    value: _root_.scala.Int
  ): _root_.courier.Path = _root_.courier.Path(
    path,
    value
  )
}
