package com.pay.common.framework.test;

import java.io.*;
import java.util.Properties;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TestScript {
  private static final String CONFIG_KEY = "test.properties";
  private QATestProperties qaTestProperties = null;


  @Test(enabled = true, groups = {"init"})
  public void initialize() throws Exception {
    // Initialize properties
    initConfig();
  }

  @Test(enabled = false)
  public void initConfig() {
    // Read properties file
    Properties prop = new Properties();
    try {
      try {
        File propertyFile = new File(System.getProperty(CONFIG_KEY));
        prop.load(new FileInputStream(propertyFile));
      } catch (NullPointerException npe) { //
        // If system config not defined load backup file
        prop.load(new FileInputStream("./test.properties"));
      }
    } catch (IOException e) { //
      throw new RuntimeException("Config File Not Found.");
    }
    this.qaTestProperties = new QATestProperties(prop);
  }

  @Test(enabled = false)
  public QATestProperties getQATestProperties() {
    System.out.println("this method called");
    return qaTestProperties;
  }




// JDBC





  // API

  @Test(enabled = false)
  public String base_uri(String request) {

    initConfig();

    String url = null;
    try {
//      uri = new URI(qaTestProperties.getReqProtocol(), qaTestProperties.getReqAuth(), qaTestProperties.getReqHost(),
//              Integer.parseInt(qaTestProperties.getReqPort()), request, qaTestProperties.getReqQuery(),
//              qaTestProperties.getReqFragment());
//
//      url = uri.toString().replace(":3123","");
//      url = url.replace("test","");

      url = qaTestProperties.getReqProtocol() +"://" +qaTestProperties.getReqHost() + "/" + request;

      System.out.println("URI == " + url);
    } catch (Exception e) {
      e.printStackTrace();
    }


    return url;
  }

  @Test(enabled = false)
  public String path(String endPoint) {
    initConfig();
    return endPoint;
  }

  @Test(enabled = false)
  public String path(String path, String endPoint) {
    initConfig();
    return path + endPoint;
  }

  @Test(enabled = false)
  public String base_uri(String request, String query) {
    initConfig();
    String url = null;
    try {
      url = qaTestProperties.getReqProtocol() +"://" +qaTestProperties.getReqHost() + "/" + request +"?" + query;

      System.out.println("URI == " + url);    }
    catch (Exception e) {

    }
    return url;
  }






  @Test(enabled = false)
  public String create_user(int id, String email, String password, String username) {
    JSONObject parameters = new JSONObject();

    initConfig();
    parameters.put("id", id);
    parameters.put("username",username);
    parameters.put("firstname", qaTestProperties.getFirstname());
    parameters.put("lastname", qaTestProperties.getLastname());
    parameters.put("email", email);
    parameters.put("password", password);
    parameters.put("phone",qaTestProperties.getPhone());
    parameters.put("userStatus",qaTestProperties.getUserstatus());

    return parameters.toString();
  }




  @Test(enabled = false)
  public String update_user(int id, String email, String password, String username) {
    JSONObject parameters = new JSONObject();

    initConfig();
    parameters.put("id", id);
    parameters.put("username",username);
    parameters.put("firstname", qaTestProperties.getFirstname());
    parameters.put("lastname", qaTestProperties.getLastname());
    parameters.put("email", email);
    parameters.put("password", password);
    parameters.put("phone",qaTestProperties.getPhone());
    parameters.put("userStatus",qaTestProperties.getUserstatus());

    return parameters.toString();
  }





  @Test(enabled = false)
  public String create_token_payload() {
    JSONObject parameters = new JSONObject();
    initConfig();
    parameters.put("username", qaTestProperties.getUsername());
    parameters.put("password", qaTestProperties.getPassword());


    return parameters.toString();
  }

  @Test(enabled = false)
  public String get_payload() {
    return null;
  }


}