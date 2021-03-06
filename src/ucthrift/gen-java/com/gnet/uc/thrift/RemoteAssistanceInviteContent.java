/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.gnet.uc.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-8-12")
public class RemoteAssistanceInviteContent implements org.apache.thrift.TBase<RemoteAssistanceInviteContent, RemoteAssistanceInviteContent._Fields>, java.io.Serializable, Cloneable, Comparable<RemoteAssistanceInviteContent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RemoteAssistanceInviteContent");

  private static final org.apache.thrift.protocol.TField CONF_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("confId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CONF_PWD_FIELD_DESC = new org.apache.thrift.protocol.TField("confPwd", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONTROL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("controlType", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RemoteAssistanceInviteContentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RemoteAssistanceInviteContentTupleSchemeFactory());
  }

  public String confId; // required
  public String confPwd; // required
  public int controlType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONF_ID((short)1, "confId"),
    CONF_PWD((short)2, "confPwd"),
    CONTROL_TYPE((short)3, "controlType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CONF_ID
          return CONF_ID;
        case 2: // CONF_PWD
          return CONF_PWD;
        case 3: // CONTROL_TYPE
          return CONTROL_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CONTROLTYPE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONF_ID, new org.apache.thrift.meta_data.FieldMetaData("confId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONF_PWD, new org.apache.thrift.meta_data.FieldMetaData("confPwd", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTROL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("controlType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RemoteAssistanceInviteContent.class, metaDataMap);
  }

  public RemoteAssistanceInviteContent() {
  }

  public RemoteAssistanceInviteContent(
    String confId,
    String confPwd,
    int controlType)
  {
    this();
    this.confId = confId;
    this.confPwd = confPwd;
    this.controlType = controlType;
    setControlTypeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RemoteAssistanceInviteContent(RemoteAssistanceInviteContent other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetConfId()) {
      this.confId = other.confId;
    }
    if (other.isSetConfPwd()) {
      this.confPwd = other.confPwd;
    }
    this.controlType = other.controlType;
  }

  public RemoteAssistanceInviteContent deepCopy() {
    return new RemoteAssistanceInviteContent(this);
  }

  @Override
  public void clear() {
    this.confId = null;
    this.confPwd = null;
    setControlTypeIsSet(false);
    this.controlType = 0;
  }

  public String getConfId() {
    return this.confId;
  }

  public RemoteAssistanceInviteContent setConfId(String confId) {
    this.confId = confId;
    return this;
  }

  public void unsetConfId() {
    this.confId = null;
  }

  /** Returns true if field confId is set (has been assigned a value) and false otherwise */
  public boolean isSetConfId() {
    return this.confId != null;
  }

  public void setConfIdIsSet(boolean value) {
    if (!value) {
      this.confId = null;
    }
  }

  public String getConfPwd() {
    return this.confPwd;
  }

  public RemoteAssistanceInviteContent setConfPwd(String confPwd) {
    this.confPwd = confPwd;
    return this;
  }

  public void unsetConfPwd() {
    this.confPwd = null;
  }

  /** Returns true if field confPwd is set (has been assigned a value) and false otherwise */
  public boolean isSetConfPwd() {
    return this.confPwd != null;
  }

  public void setConfPwdIsSet(boolean value) {
    if (!value) {
      this.confPwd = null;
    }
  }

  public int getControlType() {
    return this.controlType;
  }

  public RemoteAssistanceInviteContent setControlType(int controlType) {
    this.controlType = controlType;
    setControlTypeIsSet(true);
    return this;
  }

  public void unsetControlType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONTROLTYPE_ISSET_ID);
  }

  /** Returns true if field controlType is set (has been assigned a value) and false otherwise */
  public boolean isSetControlType() {
    return EncodingUtils.testBit(__isset_bitfield, __CONTROLTYPE_ISSET_ID);
  }

  public void setControlTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONTROLTYPE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONF_ID:
      if (value == null) {
        unsetConfId();
      } else {
        setConfId((String)value);
      }
      break;

    case CONF_PWD:
      if (value == null) {
        unsetConfPwd();
      } else {
        setConfPwd((String)value);
      }
      break;

    case CONTROL_TYPE:
      if (value == null) {
        unsetControlType();
      } else {
        setControlType((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONF_ID:
      return getConfId();

    case CONF_PWD:
      return getConfPwd();

    case CONTROL_TYPE:
      return Integer.valueOf(getControlType());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONF_ID:
      return isSetConfId();
    case CONF_PWD:
      return isSetConfPwd();
    case CONTROL_TYPE:
      return isSetControlType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RemoteAssistanceInviteContent)
      return this.equals((RemoteAssistanceInviteContent)that);
    return false;
  }

  public boolean equals(RemoteAssistanceInviteContent that) {
    if (that == null)
      return false;

    boolean this_present_confId = true && this.isSetConfId();
    boolean that_present_confId = true && that.isSetConfId();
    if (this_present_confId || that_present_confId) {
      if (!(this_present_confId && that_present_confId))
        return false;
      if (!this.confId.equals(that.confId))
        return false;
    }

    boolean this_present_confPwd = true && this.isSetConfPwd();
    boolean that_present_confPwd = true && that.isSetConfPwd();
    if (this_present_confPwd || that_present_confPwd) {
      if (!(this_present_confPwd && that_present_confPwd))
        return false;
      if (!this.confPwd.equals(that.confPwd))
        return false;
    }

    boolean this_present_controlType = true;
    boolean that_present_controlType = true;
    if (this_present_controlType || that_present_controlType) {
      if (!(this_present_controlType && that_present_controlType))
        return false;
      if (this.controlType != that.controlType)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_confId = true && (isSetConfId());
    list.add(present_confId);
    if (present_confId)
      list.add(confId);

    boolean present_confPwd = true && (isSetConfPwd());
    list.add(present_confPwd);
    if (present_confPwd)
      list.add(confPwd);

    boolean present_controlType = true;
    list.add(present_controlType);
    if (present_controlType)
      list.add(controlType);

    return list.hashCode();
  }

  @Override
  public int compareTo(RemoteAssistanceInviteContent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConfId()).compareTo(other.isSetConfId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confId, other.confId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfPwd()).compareTo(other.isSetConfPwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfPwd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confPwd, other.confPwd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetControlType()).compareTo(other.isSetControlType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetControlType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.controlType, other.controlType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RemoteAssistanceInviteContent(");
    boolean first = true;

    sb.append("confId:");
    if (this.confId == null) {
      sb.append("null");
    } else {
      sb.append(this.confId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("confPwd:");
    if (this.confPwd == null) {
      sb.append("null");
    } else {
      sb.append(this.confPwd);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("controlType:");
    sb.append(this.controlType);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (confId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'confId' was not present! Struct: " + toString());
    }
    if (confPwd == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'confPwd' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'controlType' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RemoteAssistanceInviteContentStandardSchemeFactory implements SchemeFactory {
    public RemoteAssistanceInviteContentStandardScheme getScheme() {
      return new RemoteAssistanceInviteContentStandardScheme();
    }
  }

  private static class RemoteAssistanceInviteContentStandardScheme extends StandardScheme<RemoteAssistanceInviteContent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RemoteAssistanceInviteContent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONF_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.confId = iprot.readString();
              struct.setConfIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONF_PWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.confPwd = iprot.readString();
              struct.setConfPwdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTROL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.controlType = iprot.readI32();
              struct.setControlTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetControlType()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'controlType' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RemoteAssistanceInviteContent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.confId != null) {
        oprot.writeFieldBegin(CONF_ID_FIELD_DESC);
        oprot.writeString(struct.confId);
        oprot.writeFieldEnd();
      }
      if (struct.confPwd != null) {
        oprot.writeFieldBegin(CONF_PWD_FIELD_DESC);
        oprot.writeString(struct.confPwd);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CONTROL_TYPE_FIELD_DESC);
      oprot.writeI32(struct.controlType);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RemoteAssistanceInviteContentTupleSchemeFactory implements SchemeFactory {
    public RemoteAssistanceInviteContentTupleScheme getScheme() {
      return new RemoteAssistanceInviteContentTupleScheme();
    }
  }

  private static class RemoteAssistanceInviteContentTupleScheme extends TupleScheme<RemoteAssistanceInviteContent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RemoteAssistanceInviteContent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.confId);
      oprot.writeString(struct.confPwd);
      oprot.writeI32(struct.controlType);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RemoteAssistanceInviteContent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.confId = iprot.readString();
      struct.setConfIdIsSet(true);
      struct.confPwd = iprot.readString();
      struct.setConfPwdIsSet(true);
      struct.controlType = iprot.readI32();
      struct.setControlTypeIsSet(true);
    }
  }

}

