package com.pay.common.framework.test;

import java.util.Properties;

public class QATestProperties {



  private String reqProtocol = null;
  private String reqPath = null;
  private String reqHost = null;
  private String reqPort = null;

  private String reqAuth = null;
  private String reqFragment = null;
  private String reqQuery = null;



  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  private String username = null;
  private String password = null;
  private String id = null;

  private String lastname=null;
  private String email=null;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getUserstatus() {
    return userstatus;
  }

  public void setUserstatus(String userstatus) {
    this.userstatus = userstatus;
  }

  private String phone=null;
  private String userstatus=null;




  private String firstname=null;

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }









  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }



  public QATestProperties() {
    // Non-public constructor
  }


  public QATestProperties(Properties properties) {
    if (properties == null || properties.isEmpty())
      throw new IllegalArgumentException("Invalid Properties Argument.");



    setFirstname(properties.getProperty("sp.firstname"));
    setId(properties.getProperty("sp.id"));
    setEmail(properties.getProperty("sp.email"));
    setLastname(properties.getProperty("sp.lastname"));
    setPhone(properties.getProperty("sp.phone"));
    setUserstatus(properties.getProperty("sp.userStatus"));

    setUsername(properties.getProperty("sp.username"));
    setPassword(properties.getProperty("sp.password"));


    setReqProtocol(properties.getProperty("req.protocol"));
    setReqHost(properties.getProperty("req.host"));
    setReqPort(properties.getProperty("req.port"));
    setReqPath(properties.getProperty("req.path"));
    setReqQuery(properties.getProperty("req.query"));
    setReqAuth(properties.getProperty("req.auth"));
    setReqFragment(properties.getProperty("req.fragment"));


  }




  public String getReqProtocol() {
    return reqProtocol;
  }

  public void setReqProtocol(String value) {
    if (value != null && !value.isEmpty())
      this.reqProtocol = value;
  }

  public String getReqQuery() {
    return reqQuery;
  }

  public void setReqQuery(String value) {
    if (value != null && !value.isEmpty())
      this.reqQuery = value;
  }

  public String getReqAuth() {
    return reqAuth;
  }

  public void setReqAuth(String value) {
    if (value != null && !value.isEmpty())
      this.reqAuth = value;
  }

  public String getReqFragment() {
    return reqFragment;
  }

  public void setReqFragment(String value) {
    if (value != null && !value.isEmpty())
      this.reqFragment = value;
  }

  public String getReqPath() {
    return reqPath;
  }

  public void setReqPath(String value) {
    if (value != null && !value.isEmpty())
      this.reqPath = value;
  }

  public String getReqHost() {
    return reqHost;
  }

  public void setReqHost(String value) {
    if (value != null && !value.isEmpty())
      this.reqHost = value;
  }

  public String getReqPort() {
    return reqPort;
  }

  public void setReqPort(String value) {
    if (value != null && !value.isEmpty())
      this.reqPort = value;
  }
}