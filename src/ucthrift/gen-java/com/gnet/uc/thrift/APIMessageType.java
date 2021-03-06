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

public enum APIMessageType implements org.apache.thrift.TEnum {
  AppMsg(1),
  AppAck(2),
  AppControl(3);

  private final int value;

  private APIMessageType(int value) {
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
  public static APIMessageType findByValue(int value) { 
    switch (value) {
      case 1:
        return AppMsg;
      case 2:
        return AppAck;
      case 3:
        return AppControl;
      default:
        return null;
    }
  }
}
