/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.gnet.uc.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum FSDetailType implements org.apache.thrift.TEnum {
  Document(0),
  Code(1);

  private final int value;

  private FSDetailType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static FSDetailType findByValue(int value) { 
    switch (value) {
      case 0:
        return Document;
      case 1:
        return Code;
      default:
        return null;
    }
  }
}