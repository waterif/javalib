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
public class GroupTopContent implements org.apache.thrift.TBase<GroupTopContent, GroupTopContent._Fields>, java.io.Serializable, Cloneable, Comparable<GroupTopContent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GroupTopContent");

  private static final org.apache.thrift.protocol.TField OPERATORID_FIELD_DESC = new org.apache.thrift.protocol.TField("operatorid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField GROUPID_FIELD_DESC = new org.apache.thrift.protocol.TField("groupid", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField IS_TOP_FIELD_DESC = new org.apache.thrift.protocol.TField("isTop", org.apache.thrift.protocol.TType.BYTE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GroupTopContentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GroupTopContentTupleSchemeFactory());
  }

  public int operatorid; // required
  public int groupid; // required
  public byte isTop; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATORID((short)1, "operatorid"),
    GROUPID((short)2, "groupid"),
    IS_TOP((short)3, "isTop");

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
        case 1: // OPERATORID
          return OPERATORID;
        case 2: // GROUPID
          return GROUPID;
        case 3: // IS_TOP
          return IS_TOP;
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
  private static final int __OPERATORID_ISSET_ID = 0;
  private static final int __GROUPID_ISSET_ID = 1;
  private static final int __ISTOP_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATORID, new org.apache.thrift.meta_data.FieldMetaData("operatorid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.GROUPID, new org.apache.thrift.meta_data.FieldMetaData("groupid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_TOP, new org.apache.thrift.meta_data.FieldMetaData("isTop", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GroupTopContent.class, metaDataMap);
  }

  public GroupTopContent() {
  }

  public GroupTopContent(
    int operatorid,
    int groupid,
    byte isTop)
  {
    this();
    this.operatorid = operatorid;
    setOperatoridIsSet(true);
    this.groupid = groupid;
    setGroupidIsSet(true);
    this.isTop = isTop;
    setIsTopIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GroupTopContent(GroupTopContent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.operatorid = other.operatorid;
    this.groupid = other.groupid;
    this.isTop = other.isTop;
  }

  public GroupTopContent deepCopy() {
    return new GroupTopContent(this);
  }

  @Override
  public void clear() {
    setOperatoridIsSet(false);
    this.operatorid = 0;
    setGroupidIsSet(false);
    this.groupid = 0;
    setIsTopIsSet(false);
    this.isTop = 0;
  }

  public int getOperatorid() {
    return this.operatorid;
  }

  public GroupTopContent setOperatorid(int operatorid) {
    this.operatorid = operatorid;
    setOperatoridIsSet(true);
    return this;
  }

  public void unsetOperatorid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPERATORID_ISSET_ID);
  }

  /** Returns true if field operatorid is set (has been assigned a value) and false otherwise */
  public boolean isSetOperatorid() {
    return EncodingUtils.testBit(__isset_bitfield, __OPERATORID_ISSET_ID);
  }

  public void setOperatoridIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPERATORID_ISSET_ID, value);
  }

  public int getGroupid() {
    return this.groupid;
  }

  public GroupTopContent setGroupid(int groupid) {
    this.groupid = groupid;
    setGroupidIsSet(true);
    return this;
  }

  public void unsetGroupid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GROUPID_ISSET_ID);
  }

  /** Returns true if field groupid is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupid() {
    return EncodingUtils.testBit(__isset_bitfield, __GROUPID_ISSET_ID);
  }

  public void setGroupidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GROUPID_ISSET_ID, value);
  }

  public byte getIsTop() {
    return this.isTop;
  }

  public GroupTopContent setIsTop(byte isTop) {
    this.isTop = isTop;
    setIsTopIsSet(true);
    return this;
  }

  public void unsetIsTop() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISTOP_ISSET_ID);
  }

  /** Returns true if field isTop is set (has been assigned a value) and false otherwise */
  public boolean isSetIsTop() {
    return EncodingUtils.testBit(__isset_bitfield, __ISTOP_ISSET_ID);
  }

  public void setIsTopIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISTOP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATORID:
      if (value == null) {
        unsetOperatorid();
      } else {
        setOperatorid((Integer)value);
      }
      break;

    case GROUPID:
      if (value == null) {
        unsetGroupid();
      } else {
        setGroupid((Integer)value);
      }
      break;

    case IS_TOP:
      if (value == null) {
        unsetIsTop();
      } else {
        setIsTop((Byte)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATORID:
      return Integer.valueOf(getOperatorid());

    case GROUPID:
      return Integer.valueOf(getGroupid());

    case IS_TOP:
      return Byte.valueOf(getIsTop());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATORID:
      return isSetOperatorid();
    case GROUPID:
      return isSetGroupid();
    case IS_TOP:
      return isSetIsTop();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GroupTopContent)
      return this.equals((GroupTopContent)that);
    return false;
  }

  public boolean equals(GroupTopContent that) {
    if (that == null)
      return false;

    boolean this_present_operatorid = true;
    boolean that_present_operatorid = true;
    if (this_present_operatorid || that_present_operatorid) {
      if (!(this_present_operatorid && that_present_operatorid))
        return false;
      if (this.operatorid != that.operatorid)
        return false;
    }

    boolean this_present_groupid = true;
    boolean that_present_groupid = true;
    if (this_present_groupid || that_present_groupid) {
      if (!(this_present_groupid && that_present_groupid))
        return false;
      if (this.groupid != that.groupid)
        return false;
    }

    boolean this_present_isTop = true;
    boolean that_present_isTop = true;
    if (this_present_isTop || that_present_isTop) {
      if (!(this_present_isTop && that_present_isTop))
        return false;
      if (this.isTop != that.isTop)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_operatorid = true;
    list.add(present_operatorid);
    if (present_operatorid)
      list.add(operatorid);

    boolean present_groupid = true;
    list.add(present_groupid);
    if (present_groupid)
      list.add(groupid);

    boolean present_isTop = true;
    list.add(present_isTop);
    if (present_isTop)
      list.add(isTop);

    return list.hashCode();
  }

  @Override
  public int compareTo(GroupTopContent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOperatorid()).compareTo(other.isSetOperatorid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperatorid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operatorid, other.operatorid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroupid()).compareTo(other.isSetGroupid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupid, other.groupid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsTop()).compareTo(other.isSetIsTop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsTop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isTop, other.isTop);
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
    StringBuilder sb = new StringBuilder("GroupTopContent(");
    boolean first = true;

    sb.append("operatorid:");
    sb.append(this.operatorid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("groupid:");
    sb.append(this.groupid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isTop:");
    sb.append(this.isTop);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'operatorid' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'groupid' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'isTop' because it's a primitive and you chose the non-beans generator.
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

  private static class GroupTopContentStandardSchemeFactory implements SchemeFactory {
    public GroupTopContentStandardScheme getScheme() {
      return new GroupTopContentStandardScheme();
    }
  }

  private static class GroupTopContentStandardScheme extends StandardScheme<GroupTopContent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GroupTopContent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATORID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operatorid = iprot.readI32();
              struct.setOperatoridIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GROUPID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.groupid = iprot.readI32();
              struct.setGroupidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_TOP
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.isTop = iprot.readByte();
              struct.setIsTopIsSet(true);
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
      if (!struct.isSetOperatorid()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'operatorid' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetGroupid()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'groupid' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetIsTop()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'isTop' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GroupTopContent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OPERATORID_FIELD_DESC);
      oprot.writeI32(struct.operatorid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GROUPID_FIELD_DESC);
      oprot.writeI32(struct.groupid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_TOP_FIELD_DESC);
      oprot.writeByte(struct.isTop);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroupTopContentTupleSchemeFactory implements SchemeFactory {
    public GroupTopContentTupleScheme getScheme() {
      return new GroupTopContentTupleScheme();
    }
  }

  private static class GroupTopContentTupleScheme extends TupleScheme<GroupTopContent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GroupTopContent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.operatorid);
      oprot.writeI32(struct.groupid);
      oprot.writeByte(struct.isTop);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GroupTopContent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.operatorid = iprot.readI32();
      struct.setOperatoridIsSet(true);
      struct.groupid = iprot.readI32();
      struct.setGroupidIsSet(true);
      struct.isTop = iprot.readByte();
      struct.setIsTopIsSet(true);
    }
  }

}

