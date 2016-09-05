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
public class CompleteInfoContent implements org.apache.thrift.TBase<CompleteInfoContent, CompleteInfoContent._Fields>, java.io.Serializable, Cloneable, Comparable<CompleteInfoContent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CompleteInfoContent");

  private static final org.apache.thrift.protocol.TField INFO_CELL_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("info_cell_list", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("desc", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CompleteInfoContentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CompleteInfoContentTupleSchemeFactory());
  }

  public List<InfoCell> info_cell_list; // required
  public String desc; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INFO_CELL_LIST((short)1, "info_cell_list"),
    DESC((short)2, "desc");

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
        case 1: // INFO_CELL_LIST
          return INFO_CELL_LIST;
        case 2: // DESC
          return DESC;
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
  private static final _Fields optionals[] = {_Fields.DESC};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INFO_CELL_LIST, new org.apache.thrift.meta_data.FieldMetaData("info_cell_list", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, InfoCell.class))));
    tmpMap.put(_Fields.DESC, new org.apache.thrift.meta_data.FieldMetaData("desc", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CompleteInfoContent.class, metaDataMap);
  }

  public CompleteInfoContent() {
  }

  public CompleteInfoContent(
    List<InfoCell> info_cell_list)
  {
    this();
    this.info_cell_list = info_cell_list;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CompleteInfoContent(CompleteInfoContent other) {
    if (other.isSetInfo_cell_list()) {
      List<InfoCell> __this__info_cell_list = new ArrayList<InfoCell>(other.info_cell_list.size());
      for (InfoCell other_element : other.info_cell_list) {
        __this__info_cell_list.add(new InfoCell(other_element));
      }
      this.info_cell_list = __this__info_cell_list;
    }
    if (other.isSetDesc()) {
      this.desc = other.desc;
    }
  }

  public CompleteInfoContent deepCopy() {
    return new CompleteInfoContent(this);
  }

  @Override
  public void clear() {
    this.info_cell_list = null;
    this.desc = null;
  }

  public int getInfo_cell_listSize() {
    return (this.info_cell_list == null) ? 0 : this.info_cell_list.size();
  }

  public java.util.Iterator<InfoCell> getInfo_cell_listIterator() {
    return (this.info_cell_list == null) ? null : this.info_cell_list.iterator();
  }

  public void addToInfo_cell_list(InfoCell elem) {
    if (this.info_cell_list == null) {
      this.info_cell_list = new ArrayList<InfoCell>();
    }
    this.info_cell_list.add(elem);
  }

  public List<InfoCell> getInfo_cell_list() {
    return this.info_cell_list;
  }

  public CompleteInfoContent setInfo_cell_list(List<InfoCell> info_cell_list) {
    this.info_cell_list = info_cell_list;
    return this;
  }

  public void unsetInfo_cell_list() {
    this.info_cell_list = null;
  }

  /** Returns true if field info_cell_list is set (has been assigned a value) and false otherwise */
  public boolean isSetInfo_cell_list() {
    return this.info_cell_list != null;
  }

  public void setInfo_cell_listIsSet(boolean value) {
    if (!value) {
      this.info_cell_list = null;
    }
  }

  public String getDesc() {
    return this.desc;
  }

  public CompleteInfoContent setDesc(String desc) {
    this.desc = desc;
    return this;
  }

  public void unsetDesc() {
    this.desc = null;
  }

  /** Returns true if field desc is set (has been assigned a value) and false otherwise */
  public boolean isSetDesc() {
    return this.desc != null;
  }

  public void setDescIsSet(boolean value) {
    if (!value) {
      this.desc = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INFO_CELL_LIST:
      if (value == null) {
        unsetInfo_cell_list();
      } else {
        setInfo_cell_list((List<InfoCell>)value);
      }
      break;

    case DESC:
      if (value == null) {
        unsetDesc();
      } else {
        setDesc((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INFO_CELL_LIST:
      return getInfo_cell_list();

    case DESC:
      return getDesc();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INFO_CELL_LIST:
      return isSetInfo_cell_list();
    case DESC:
      return isSetDesc();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CompleteInfoContent)
      return this.equals((CompleteInfoContent)that);
    return false;
  }

  public boolean equals(CompleteInfoContent that) {
    if (that == null)
      return false;

    boolean this_present_info_cell_list = true && this.isSetInfo_cell_list();
    boolean that_present_info_cell_list = true && that.isSetInfo_cell_list();
    if (this_present_info_cell_list || that_present_info_cell_list) {
      if (!(this_present_info_cell_list && that_present_info_cell_list))
        return false;
      if (!this.info_cell_list.equals(that.info_cell_list))
        return false;
    }

    boolean this_present_desc = true && this.isSetDesc();
    boolean that_present_desc = true && that.isSetDesc();
    if (this_present_desc || that_present_desc) {
      if (!(this_present_desc && that_present_desc))
        return false;
      if (!this.desc.equals(that.desc))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_info_cell_list = true && (isSetInfo_cell_list());
    list.add(present_info_cell_list);
    if (present_info_cell_list)
      list.add(info_cell_list);

    boolean present_desc = true && (isSetDesc());
    list.add(present_desc);
    if (present_desc)
      list.add(desc);

    return list.hashCode();
  }

  @Override
  public int compareTo(CompleteInfoContent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetInfo_cell_list()).compareTo(other.isSetInfo_cell_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfo_cell_list()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.info_cell_list, other.info_cell_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDesc()).compareTo(other.isSetDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desc, other.desc);
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
    StringBuilder sb = new StringBuilder("CompleteInfoContent(");
    boolean first = true;

    sb.append("info_cell_list:");
    if (this.info_cell_list == null) {
      sb.append("null");
    } else {
      sb.append(this.info_cell_list);
    }
    first = false;
    if (isSetDesc()) {
      if (!first) sb.append(", ");
      sb.append("desc:");
      if (this.desc == null) {
        sb.append("null");
      } else {
        sb.append(this.desc);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (info_cell_list == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'info_cell_list' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CompleteInfoContentStandardSchemeFactory implements SchemeFactory {
    public CompleteInfoContentStandardScheme getScheme() {
      return new CompleteInfoContentStandardScheme();
    }
  }

  private static class CompleteInfoContentStandardScheme extends StandardScheme<CompleteInfoContent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CompleteInfoContent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INFO_CELL_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list42 = iprot.readListBegin();
                struct.info_cell_list = new ArrayList<InfoCell>(_list42.size);
                InfoCell _elem43;
                for (int _i44 = 0; _i44 < _list42.size; ++_i44)
                {
                  _elem43 = new InfoCell();
                  _elem43.read(iprot);
                  struct.info_cell_list.add(_elem43);
                }
                iprot.readListEnd();
              }
              struct.setInfo_cell_listIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.desc = iprot.readString();
              struct.setDescIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CompleteInfoContent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.info_cell_list != null) {
        oprot.writeFieldBegin(INFO_CELL_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.info_cell_list.size()));
          for (InfoCell _iter45 : struct.info_cell_list)
          {
            _iter45.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.desc != null) {
        if (struct.isSetDesc()) {
          oprot.writeFieldBegin(DESC_FIELD_DESC);
          oprot.writeString(struct.desc);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CompleteInfoContentTupleSchemeFactory implements SchemeFactory {
    public CompleteInfoContentTupleScheme getScheme() {
      return new CompleteInfoContentTupleScheme();
    }
  }

  private static class CompleteInfoContentTupleScheme extends TupleScheme<CompleteInfoContent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CompleteInfoContent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.info_cell_list.size());
        for (InfoCell _iter46 : struct.info_cell_list)
        {
          _iter46.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetDesc()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDesc()) {
        oprot.writeString(struct.desc);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CompleteInfoContent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.info_cell_list = new ArrayList<InfoCell>(_list47.size);
        InfoCell _elem48;
        for (int _i49 = 0; _i49 < _list47.size; ++_i49)
        {
          _elem48 = new InfoCell();
          _elem48.read(iprot);
          struct.info_cell_list.add(_elem48);
        }
      }
      struct.setInfo_cell_listIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.desc = iprot.readString();
        struct.setDescIsSet(true);
      }
    }
  }

}
