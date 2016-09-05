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

public enum SystemProtoMessageType implements org.apache.thrift.TEnum {
  SystemWelcome(1),
  ClientUpdate(2),
  CompleteInfoType(3),
  PwdRuleUpdate(4),
  clientInstallGuide(5),
  PasswordModify(6),
  SensitiveWordDelete(7),
  GroupRemind(8);

  private final int value;

  private SystemProtoMessageType(int value) {
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
  public static SystemProtoMessageType findByValue(int value) { 
    switch (value) {
      case 1:
        return SystemWelcome;
      case 2:
        return ClientUpdate;
      case 3:
        return CompleteInfoType;
      case 4:
        return PwdRuleUpdate;
      case 5:
        return clientInstallGuide;
      case 6:
        return PasswordModify;
      case 7:
        return SensitiveWordDelete;
      case 8:
        return GroupRemind;
      default:
        return null;
    }
  }
}