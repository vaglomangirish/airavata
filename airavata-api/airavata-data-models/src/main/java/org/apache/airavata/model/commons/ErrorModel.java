/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.commons;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-22")
public class ErrorModel implements org.apache.thrift.TBase<ErrorModel, ErrorModel._Fields>, java.io.Serializable, Cloneable, Comparable<ErrorModel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ErrorModel");

  private static final org.apache.thrift.protocol.TField ERROR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("errorId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("creationTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ACTUAL_ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("actualErrorMessage", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_FRIENDLY_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("userFriendlyMessage", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TRANSIENT_OR_PERSISTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("transientOrPersistent", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField ROOT_CAUSE_ERROR_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("rootCauseErrorIdList", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ErrorModelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ErrorModelTupleSchemeFactory());
  }

  private String errorId; // required
  private long creationTime; // optional
  private String actualErrorMessage; // optional
  private String userFriendlyMessage; // optional
  private boolean transientOrPersistent; // optional
  private List<String> rootCauseErrorIdList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_ID((short)1, "errorId"),
    CREATION_TIME((short)2, "creationTime"),
    ACTUAL_ERROR_MESSAGE((short)3, "actualErrorMessage"),
    USER_FRIENDLY_MESSAGE((short)4, "userFriendlyMessage"),
    TRANSIENT_OR_PERSISTENT((short)5, "transientOrPersistent"),
    ROOT_CAUSE_ERROR_ID_LIST((short)6, "rootCauseErrorIdList");

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
        case 1: // ERROR_ID
          return ERROR_ID;
        case 2: // CREATION_TIME
          return CREATION_TIME;
        case 3: // ACTUAL_ERROR_MESSAGE
          return ACTUAL_ERROR_MESSAGE;
        case 4: // USER_FRIENDLY_MESSAGE
          return USER_FRIENDLY_MESSAGE;
        case 5: // TRANSIENT_OR_PERSISTENT
          return TRANSIENT_OR_PERSISTENT;
        case 6: // ROOT_CAUSE_ERROR_ID_LIST
          return ROOT_CAUSE_ERROR_ID_LIST;
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
  private static final int __CREATIONTIME_ISSET_ID = 0;
  private static final int __TRANSIENTORPERSISTENT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CREATION_TIME,_Fields.ACTUAL_ERROR_MESSAGE,_Fields.USER_FRIENDLY_MESSAGE,_Fields.TRANSIENT_OR_PERSISTENT,_Fields.ROOT_CAUSE_ERROR_ID_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_ID, new org.apache.thrift.meta_data.FieldMetaData("errorId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("creationTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ACTUAL_ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("actualErrorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_FRIENDLY_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("userFriendlyMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRANSIENT_OR_PERSISTENT, new org.apache.thrift.meta_data.FieldMetaData("transientOrPersistent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ROOT_CAUSE_ERROR_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("rootCauseErrorIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ErrorModel.class, metaDataMap);
  }

  public ErrorModel() {
    this.errorId = "DO_NOT_SET_AT_CLIENTS";

    this.transientOrPersistent = false;

  }

  public ErrorModel(
    String errorId)
  {
    this();
    this.errorId = errorId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ErrorModel(ErrorModel other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetErrorId()) {
      this.errorId = other.errorId;
    }
    this.creationTime = other.creationTime;
    if (other.isSetActualErrorMessage()) {
      this.actualErrorMessage = other.actualErrorMessage;
    }
    if (other.isSetUserFriendlyMessage()) {
      this.userFriendlyMessage = other.userFriendlyMessage;
    }
    this.transientOrPersistent = other.transientOrPersistent;
    if (other.isSetRootCauseErrorIdList()) {
      List<String> __this__rootCauseErrorIdList = new ArrayList<String>(other.rootCauseErrorIdList);
      this.rootCauseErrorIdList = __this__rootCauseErrorIdList;
    }
  }

  public ErrorModel deepCopy() {
    return new ErrorModel(this);
  }

  @Override
  public void clear() {
    this.errorId = "DO_NOT_SET_AT_CLIENTS";

    setCreationTimeIsSet(false);
    this.creationTime = 0;
    this.actualErrorMessage = null;
    this.userFriendlyMessage = null;
    this.transientOrPersistent = false;

    this.rootCauseErrorIdList = null;
  }

  public String getErrorId() {
    return this.errorId;
  }

  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  public void unsetErrorId() {
    this.errorId = null;
  }

  /** Returns true if field errorId is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorId() {
    return this.errorId != null;
  }

  public void setErrorIdIsSet(boolean value) {
    if (!value) {
      this.errorId = null;
    }
  }

  public long getCreationTime() {
    return this.creationTime;
  }

  public void setCreationTime(long creationTime) {
    this.creationTime = creationTime;
    setCreationTimeIsSet(true);
  }

  public void unsetCreationTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  /** Returns true if field creationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreationTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATIONTIME_ISSET_ID);
  }

  public void setCreationTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATIONTIME_ISSET_ID, value);
  }

  public String getActualErrorMessage() {
    return this.actualErrorMessage;
  }

  public void setActualErrorMessage(String actualErrorMessage) {
    this.actualErrorMessage = actualErrorMessage;
  }

  public void unsetActualErrorMessage() {
    this.actualErrorMessage = null;
  }

  /** Returns true if field actualErrorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetActualErrorMessage() {
    return this.actualErrorMessage != null;
  }

  public void setActualErrorMessageIsSet(boolean value) {
    if (!value) {
      this.actualErrorMessage = null;
    }
  }

  public String getUserFriendlyMessage() {
    return this.userFriendlyMessage;
  }

  public void setUserFriendlyMessage(String userFriendlyMessage) {
    this.userFriendlyMessage = userFriendlyMessage;
  }

  public void unsetUserFriendlyMessage() {
    this.userFriendlyMessage = null;
  }

  /** Returns true if field userFriendlyMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetUserFriendlyMessage() {
    return this.userFriendlyMessage != null;
  }

  public void setUserFriendlyMessageIsSet(boolean value) {
    if (!value) {
      this.userFriendlyMessage = null;
    }
  }

  public boolean isTransientOrPersistent() {
    return this.transientOrPersistent;
  }

  public void setTransientOrPersistent(boolean transientOrPersistent) {
    this.transientOrPersistent = transientOrPersistent;
    setTransientOrPersistentIsSet(true);
  }

  public void unsetTransientOrPersistent() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TRANSIENTORPERSISTENT_ISSET_ID);
  }

  /** Returns true if field transientOrPersistent is set (has been assigned a value) and false otherwise */
  public boolean isSetTransientOrPersistent() {
    return EncodingUtils.testBit(__isset_bitfield, __TRANSIENTORPERSISTENT_ISSET_ID);
  }

  public void setTransientOrPersistentIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TRANSIENTORPERSISTENT_ISSET_ID, value);
  }

  public int getRootCauseErrorIdListSize() {
    return (this.rootCauseErrorIdList == null) ? 0 : this.rootCauseErrorIdList.size();
  }

  public java.util.Iterator<String> getRootCauseErrorIdListIterator() {
    return (this.rootCauseErrorIdList == null) ? null : this.rootCauseErrorIdList.iterator();
  }

  public void addToRootCauseErrorIdList(String elem) {
    if (this.rootCauseErrorIdList == null) {
      this.rootCauseErrorIdList = new ArrayList<String>();
    }
    this.rootCauseErrorIdList.add(elem);
  }

  public List<String> getRootCauseErrorIdList() {
    return this.rootCauseErrorIdList;
  }

  public void setRootCauseErrorIdList(List<String> rootCauseErrorIdList) {
    this.rootCauseErrorIdList = rootCauseErrorIdList;
  }

  public void unsetRootCauseErrorIdList() {
    this.rootCauseErrorIdList = null;
  }

  /** Returns true if field rootCauseErrorIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetRootCauseErrorIdList() {
    return this.rootCauseErrorIdList != null;
  }

  public void setRootCauseErrorIdListIsSet(boolean value) {
    if (!value) {
      this.rootCauseErrorIdList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_ID:
      if (value == null) {
        unsetErrorId();
      } else {
        setErrorId((String)value);
      }
      break;

    case CREATION_TIME:
      if (value == null) {
        unsetCreationTime();
      } else {
        setCreationTime((Long)value);
      }
      break;

    case ACTUAL_ERROR_MESSAGE:
      if (value == null) {
        unsetActualErrorMessage();
      } else {
        setActualErrorMessage((String)value);
      }
      break;

    case USER_FRIENDLY_MESSAGE:
      if (value == null) {
        unsetUserFriendlyMessage();
      } else {
        setUserFriendlyMessage((String)value);
      }
      break;

    case TRANSIENT_OR_PERSISTENT:
      if (value == null) {
        unsetTransientOrPersistent();
      } else {
        setTransientOrPersistent((Boolean)value);
      }
      break;

    case ROOT_CAUSE_ERROR_ID_LIST:
      if (value == null) {
        unsetRootCauseErrorIdList();
      } else {
        setRootCauseErrorIdList((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_ID:
      return getErrorId();

    case CREATION_TIME:
      return getCreationTime();

    case ACTUAL_ERROR_MESSAGE:
      return getActualErrorMessage();

    case USER_FRIENDLY_MESSAGE:
      return getUserFriendlyMessage();

    case TRANSIENT_OR_PERSISTENT:
      return isTransientOrPersistent();

    case ROOT_CAUSE_ERROR_ID_LIST:
      return getRootCauseErrorIdList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_ID:
      return isSetErrorId();
    case CREATION_TIME:
      return isSetCreationTime();
    case ACTUAL_ERROR_MESSAGE:
      return isSetActualErrorMessage();
    case USER_FRIENDLY_MESSAGE:
      return isSetUserFriendlyMessage();
    case TRANSIENT_OR_PERSISTENT:
      return isSetTransientOrPersistent();
    case ROOT_CAUSE_ERROR_ID_LIST:
      return isSetRootCauseErrorIdList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ErrorModel)
      return this.equals((ErrorModel)that);
    return false;
  }

  public boolean equals(ErrorModel that) {
    if (that == null)
      return false;

    boolean this_present_errorId = true && this.isSetErrorId();
    boolean that_present_errorId = true && that.isSetErrorId();
    if (this_present_errorId || that_present_errorId) {
      if (!(this_present_errorId && that_present_errorId))
        return false;
      if (!this.errorId.equals(that.errorId))
        return false;
    }

    boolean this_present_creationTime = true && this.isSetCreationTime();
    boolean that_present_creationTime = true && that.isSetCreationTime();
    if (this_present_creationTime || that_present_creationTime) {
      if (!(this_present_creationTime && that_present_creationTime))
        return false;
      if (this.creationTime != that.creationTime)
        return false;
    }

    boolean this_present_actualErrorMessage = true && this.isSetActualErrorMessage();
    boolean that_present_actualErrorMessage = true && that.isSetActualErrorMessage();
    if (this_present_actualErrorMessage || that_present_actualErrorMessage) {
      if (!(this_present_actualErrorMessage && that_present_actualErrorMessage))
        return false;
      if (!this.actualErrorMessage.equals(that.actualErrorMessage))
        return false;
    }

    boolean this_present_userFriendlyMessage = true && this.isSetUserFriendlyMessage();
    boolean that_present_userFriendlyMessage = true && that.isSetUserFriendlyMessage();
    if (this_present_userFriendlyMessage || that_present_userFriendlyMessage) {
      if (!(this_present_userFriendlyMessage && that_present_userFriendlyMessage))
        return false;
      if (!this.userFriendlyMessage.equals(that.userFriendlyMessage))
        return false;
    }

    boolean this_present_transientOrPersistent = true && this.isSetTransientOrPersistent();
    boolean that_present_transientOrPersistent = true && that.isSetTransientOrPersistent();
    if (this_present_transientOrPersistent || that_present_transientOrPersistent) {
      if (!(this_present_transientOrPersistent && that_present_transientOrPersistent))
        return false;
      if (this.transientOrPersistent != that.transientOrPersistent)
        return false;
    }

    boolean this_present_rootCauseErrorIdList = true && this.isSetRootCauseErrorIdList();
    boolean that_present_rootCauseErrorIdList = true && that.isSetRootCauseErrorIdList();
    if (this_present_rootCauseErrorIdList || that_present_rootCauseErrorIdList) {
      if (!(this_present_rootCauseErrorIdList && that_present_rootCauseErrorIdList))
        return false;
      if (!this.rootCauseErrorIdList.equals(that.rootCauseErrorIdList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_errorId = true && (isSetErrorId());
    list.add(present_errorId);
    if (present_errorId)
      list.add(errorId);

    boolean present_creationTime = true && (isSetCreationTime());
    list.add(present_creationTime);
    if (present_creationTime)
      list.add(creationTime);

    boolean present_actualErrorMessage = true && (isSetActualErrorMessage());
    list.add(present_actualErrorMessage);
    if (present_actualErrorMessage)
      list.add(actualErrorMessage);

    boolean present_userFriendlyMessage = true && (isSetUserFriendlyMessage());
    list.add(present_userFriendlyMessage);
    if (present_userFriendlyMessage)
      list.add(userFriendlyMessage);

    boolean present_transientOrPersistent = true && (isSetTransientOrPersistent());
    list.add(present_transientOrPersistent);
    if (present_transientOrPersistent)
      list.add(transientOrPersistent);

    boolean present_rootCauseErrorIdList = true && (isSetRootCauseErrorIdList());
    list.add(present_rootCauseErrorIdList);
    if (present_rootCauseErrorIdList)
      list.add(rootCauseErrorIdList);

    return list.hashCode();
  }

  @Override
  public int compareTo(ErrorModel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrorId()).compareTo(other.isSetErrorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorId, other.errorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreationTime()).compareTo(other.isSetCreationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creationTime, other.creationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActualErrorMessage()).compareTo(other.isSetActualErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActualErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actualErrorMessage, other.actualErrorMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserFriendlyMessage()).compareTo(other.isSetUserFriendlyMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserFriendlyMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userFriendlyMessage, other.userFriendlyMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTransientOrPersistent()).compareTo(other.isSetTransientOrPersistent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransientOrPersistent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transientOrPersistent, other.transientOrPersistent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRootCauseErrorIdList()).compareTo(other.isSetRootCauseErrorIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRootCauseErrorIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rootCauseErrorIdList, other.rootCauseErrorIdList);
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
    StringBuilder sb = new StringBuilder("ErrorModel(");
    boolean first = true;

    sb.append("errorId:");
    if (this.errorId == null) {
      sb.append("null");
    } else {
      sb.append(this.errorId);
    }
    first = false;
    if (isSetCreationTime()) {
      if (!first) sb.append(", ");
      sb.append("creationTime:");
      sb.append(this.creationTime);
      first = false;
    }
    if (isSetActualErrorMessage()) {
      if (!first) sb.append(", ");
      sb.append("actualErrorMessage:");
      if (this.actualErrorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.actualErrorMessage);
      }
      first = false;
    }
    if (isSetUserFriendlyMessage()) {
      if (!first) sb.append(", ");
      sb.append("userFriendlyMessage:");
      if (this.userFriendlyMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.userFriendlyMessage);
      }
      first = false;
    }
    if (isSetTransientOrPersistent()) {
      if (!first) sb.append(", ");
      sb.append("transientOrPersistent:");
      sb.append(this.transientOrPersistent);
      first = false;
    }
    if (isSetRootCauseErrorIdList()) {
      if (!first) sb.append(", ");
      sb.append("rootCauseErrorIdList:");
      if (this.rootCauseErrorIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.rootCauseErrorIdList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetErrorId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'errorId' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ErrorModelStandardSchemeFactory implements SchemeFactory {
    public ErrorModelStandardScheme getScheme() {
      return new ErrorModelStandardScheme();
    }
  }

  private static class ErrorModelStandardScheme extends StandardScheme<ErrorModel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ErrorModel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorId = iprot.readString();
              struct.setErrorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.creationTime = iprot.readI64();
              struct.setCreationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACTUAL_ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.actualErrorMessage = iprot.readString();
              struct.setActualErrorMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_FRIENDLY_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userFriendlyMessage = iprot.readString();
              struct.setUserFriendlyMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TRANSIENT_OR_PERSISTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.transientOrPersistent = iprot.readBool();
              struct.setTransientOrPersistentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ROOT_CAUSE_ERROR_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.rootCauseErrorIdList = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.rootCauseErrorIdList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRootCauseErrorIdListIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ErrorModel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.errorId != null) {
        oprot.writeFieldBegin(ERROR_ID_FIELD_DESC);
        oprot.writeString(struct.errorId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreationTime()) {
        oprot.writeFieldBegin(CREATION_TIME_FIELD_DESC);
        oprot.writeI64(struct.creationTime);
        oprot.writeFieldEnd();
      }
      if (struct.actualErrorMessage != null) {
        if (struct.isSetActualErrorMessage()) {
          oprot.writeFieldBegin(ACTUAL_ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.actualErrorMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.userFriendlyMessage != null) {
        if (struct.isSetUserFriendlyMessage()) {
          oprot.writeFieldBegin(USER_FRIENDLY_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.userFriendlyMessage);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTransientOrPersistent()) {
        oprot.writeFieldBegin(TRANSIENT_OR_PERSISTENT_FIELD_DESC);
        oprot.writeBool(struct.transientOrPersistent);
        oprot.writeFieldEnd();
      }
      if (struct.rootCauseErrorIdList != null) {
        if (struct.isSetRootCauseErrorIdList()) {
          oprot.writeFieldBegin(ROOT_CAUSE_ERROR_ID_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.rootCauseErrorIdList.size()));
            for (String _iter3 : struct.rootCauseErrorIdList)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ErrorModelTupleSchemeFactory implements SchemeFactory {
    public ErrorModelTupleScheme getScheme() {
      return new ErrorModelTupleScheme();
    }
  }

  private static class ErrorModelTupleScheme extends TupleScheme<ErrorModel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ErrorModel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.errorId);
      BitSet optionals = new BitSet();
      if (struct.isSetCreationTime()) {
        optionals.set(0);
      }
      if (struct.isSetActualErrorMessage()) {
        optionals.set(1);
      }
      if (struct.isSetUserFriendlyMessage()) {
        optionals.set(2);
      }
      if (struct.isSetTransientOrPersistent()) {
        optionals.set(3);
      }
      if (struct.isSetRootCauseErrorIdList()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCreationTime()) {
        oprot.writeI64(struct.creationTime);
      }
      if (struct.isSetActualErrorMessage()) {
        oprot.writeString(struct.actualErrorMessage);
      }
      if (struct.isSetUserFriendlyMessage()) {
        oprot.writeString(struct.userFriendlyMessage);
      }
      if (struct.isSetTransientOrPersistent()) {
        oprot.writeBool(struct.transientOrPersistent);
      }
      if (struct.isSetRootCauseErrorIdList()) {
        {
          oprot.writeI32(struct.rootCauseErrorIdList.size());
          for (String _iter4 : struct.rootCauseErrorIdList)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ErrorModel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.errorId = iprot.readString();
      struct.setErrorIdIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.creationTime = iprot.readI64();
        struct.setCreationTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.actualErrorMessage = iprot.readString();
        struct.setActualErrorMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.userFriendlyMessage = iprot.readString();
        struct.setUserFriendlyMessageIsSet(true);
      }
      if (incoming.get(3)) {
        struct.transientOrPersistent = iprot.readBool();
        struct.setTransientOrPersistentIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.rootCauseErrorIdList = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.rootCauseErrorIdList.add(_elem6);
          }
        }
        struct.setRootCauseErrorIdListIsSet(true);
      }
    }
  }

}

