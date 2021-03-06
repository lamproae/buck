/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-07-12")
public class FrontendRequest implements org.apache.thrift.TBase<FrontendRequest, FrontendRequest._Fields>, java.io.Serializable, Cloneable, Comparable<FrontendRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FrontendRequest");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField START_BUILD_FIELD_DESC = new org.apache.thrift.protocol.TField("startBuild", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BUILD_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("buildStatus", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FrontendRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FrontendRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see FrontendRequestType
   */
  public FrontendRequestType type; // optional
  public StartBuildRequest startBuild; // optional
  public BuildStatusRequest buildStatus; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see FrontendRequestType
     */
    TYPE((short)1, "type"),
    START_BUILD((short)2, "startBuild"),
    BUILD_STATUS((short)3, "buildStatus");

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
        case 1: // TYPE
          return TYPE;
        case 2: // START_BUILD
          return START_BUILD;
        case 3: // BUILD_STATUS
          return BUILD_STATUS;
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
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.START_BUILD,_Fields.BUILD_STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FrontendRequestType.class)));
    tmpMap.put(_Fields.START_BUILD, new org.apache.thrift.meta_data.FieldMetaData("startBuild", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StartBuildRequest.class)));
    tmpMap.put(_Fields.BUILD_STATUS, new org.apache.thrift.meta_data.FieldMetaData("buildStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildStatusRequest.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FrontendRequest.class, metaDataMap);
  }

  public FrontendRequest() {
    this.type = com.facebook.buck.distributed.thrift.FrontendRequestType.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FrontendRequest(FrontendRequest other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetStartBuild()) {
      this.startBuild = new StartBuildRequest(other.startBuild);
    }
    if (other.isSetBuildStatus()) {
      this.buildStatus = new BuildStatusRequest(other.buildStatus);
    }
  }

  public FrontendRequest deepCopy() {
    return new FrontendRequest(this);
  }

  @Override
  public void clear() {
    this.type = com.facebook.buck.distributed.thrift.FrontendRequestType.UNKNOWN;

    this.startBuild = null;
    this.buildStatus = null;
  }

  /**
   * 
   * @see FrontendRequestType
   */
  public FrontendRequestType getType() {
    return this.type;
  }

  /**
   * 
   * @see FrontendRequestType
   */
  public FrontendRequest setType(FrontendRequestType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public StartBuildRequest getStartBuild() {
    return this.startBuild;
  }

  public FrontendRequest setStartBuild(StartBuildRequest startBuild) {
    this.startBuild = startBuild;
    return this;
  }

  public void unsetStartBuild() {
    this.startBuild = null;
  }

  /** Returns true if field startBuild is set (has been assigned a value) and false otherwise */
  public boolean isSetStartBuild() {
    return this.startBuild != null;
  }

  public void setStartBuildIsSet(boolean value) {
    if (!value) {
      this.startBuild = null;
    }
  }

  public BuildStatusRequest getBuildStatus() {
    return this.buildStatus;
  }

  public FrontendRequest setBuildStatus(BuildStatusRequest buildStatus) {
    this.buildStatus = buildStatus;
    return this;
  }

  public void unsetBuildStatus() {
    this.buildStatus = null;
  }

  /** Returns true if field buildStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildStatus() {
    return this.buildStatus != null;
  }

  public void setBuildStatusIsSet(boolean value) {
    if (!value) {
      this.buildStatus = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((FrontendRequestType)value);
      }
      break;

    case START_BUILD:
      if (value == null) {
        unsetStartBuild();
      } else {
        setStartBuild((StartBuildRequest)value);
      }
      break;

    case BUILD_STATUS:
      if (value == null) {
        unsetBuildStatus();
      } else {
        setBuildStatus((BuildStatusRequest)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case START_BUILD:
      return getStartBuild();

    case BUILD_STATUS:
      return getBuildStatus();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case START_BUILD:
      return isSetStartBuild();
    case BUILD_STATUS:
      return isSetBuildStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FrontendRequest)
      return this.equals((FrontendRequest)that);
    return false;
  }

  public boolean equals(FrontendRequest that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_startBuild = true && this.isSetStartBuild();
    boolean that_present_startBuild = true && that.isSetStartBuild();
    if (this_present_startBuild || that_present_startBuild) {
      if (!(this_present_startBuild && that_present_startBuild))
        return false;
      if (!this.startBuild.equals(that.startBuild))
        return false;
    }

    boolean this_present_buildStatus = true && this.isSetBuildStatus();
    boolean that_present_buildStatus = true && that.isSetBuildStatus();
    if (this_present_buildStatus || that_present_buildStatus) {
      if (!(this_present_buildStatus && that_present_buildStatus))
        return false;
      if (!this.buildStatus.equals(that.buildStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_startBuild = true && (isSetStartBuild());
    list.add(present_startBuild);
    if (present_startBuild)
      list.add(startBuild);

    boolean present_buildStatus = true && (isSetBuildStatus());
    list.add(present_buildStatus);
    if (present_buildStatus)
      list.add(buildStatus);

    return list.hashCode();
  }

  @Override
  public int compareTo(FrontendRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartBuild()).compareTo(other.isSetStartBuild());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartBuild()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startBuild, other.startBuild);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildStatus()).compareTo(other.isSetBuildStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildStatus, other.buildStatus);
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
    StringBuilder sb = new StringBuilder("FrontendRequest(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetStartBuild()) {
      if (!first) sb.append(", ");
      sb.append("startBuild:");
      if (this.startBuild == null) {
        sb.append("null");
      } else {
        sb.append(this.startBuild);
      }
      first = false;
    }
    if (isSetBuildStatus()) {
      if (!first) sb.append(", ");
      sb.append("buildStatus:");
      if (this.buildStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.buildStatus);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (startBuild != null) {
      startBuild.validate();
    }
    if (buildStatus != null) {
      buildStatus.validate();
    }
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

  private static class FrontendRequestStandardSchemeFactory implements SchemeFactory {
    public FrontendRequestStandardScheme getScheme() {
      return new FrontendRequestStandardScheme();
    }
  }

  private static class FrontendRequestStandardScheme extends StandardScheme<FrontendRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FrontendRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.facebook.buck.distributed.thrift.FrontendRequestType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_BUILD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.startBuild = new StartBuildRequest();
              struct.startBuild.read(iprot);
              struct.setStartBuildIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUILD_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildStatus = new BuildStatusRequest();
              struct.buildStatus.read(iprot);
              struct.setBuildStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FrontendRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.startBuild != null) {
        if (struct.isSetStartBuild()) {
          oprot.writeFieldBegin(START_BUILD_FIELD_DESC);
          struct.startBuild.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildStatus != null) {
        if (struct.isSetBuildStatus()) {
          oprot.writeFieldBegin(BUILD_STATUS_FIELD_DESC);
          struct.buildStatus.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FrontendRequestTupleSchemeFactory implements SchemeFactory {
    public FrontendRequestTupleScheme getScheme() {
      return new FrontendRequestTupleScheme();
    }
  }

  private static class FrontendRequestTupleScheme extends TupleScheme<FrontendRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FrontendRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetStartBuild()) {
        optionals.set(1);
      }
      if (struct.isSetBuildStatus()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetStartBuild()) {
        struct.startBuild.write(oprot);
      }
      if (struct.isSetBuildStatus()) {
        struct.buildStatus.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FrontendRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.type = com.facebook.buck.distributed.thrift.FrontendRequestType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startBuild = new StartBuildRequest();
        struct.startBuild.read(iprot);
        struct.setStartBuildIsSet(true);
      }
      if (incoming.get(2)) {
        struct.buildStatus = new BuildStatusRequest();
        struct.buildStatus.read(iprot);
        struct.setBuildStatusIsSet(true);
      }
    }
  }

}

