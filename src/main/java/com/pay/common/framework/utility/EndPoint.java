package com.pay.common.framework.utility;

public enum EndPoint {


  USERS("v2/user/"),
  LOGOUT("logout/"),
  LOGIN("v2/user/login");



  private final String value;

  EndPoint(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}
