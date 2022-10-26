package com.pay.common.framework.utility;

import com.pay.common.framework.test.TestScript;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST extends TestScript {

  Response response = null;



  public Response create_users(String uri,int id,String email,String password,String username) {
    RestAssured.baseURI = uri;
    RequestSpecification httpRequest = RestAssured.given();
    httpRequest.header("Content-Type", "application/json");
    httpRequest.body(create_user(id,email,password,username));
    return httpRequest.post();

  }


  public Response create_tokens(String uri) {
    RestAssured.baseURI = uri;
    RequestSpecification httpRequest = RestAssured.given();
    httpRequest.header("Content-Type", "application/json");
    httpRequest.body(create_token_payload());

    return httpRequest.post();
  }
}
