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

public enum ConfInviteMessageId implements org.apache.thrift.TEnum {
  IQInvite(1),
  IQReceive(2),
  IQReject(3);

  private final int value;

  private ConfInviteMessageId(int value) {
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
  public static ConfInviteMessageId findByValue(int value) { 
    switch (value) {
      case 1:
        return IQInvite;
      case 2:
        return IQReceive;
      case 3:
        return IQReject;
      default:
        return null;
    }
  }
}
