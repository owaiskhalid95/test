package com.pay.common.framework.utility;

import com.pay.common.framework.test.TestScript;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIRequests extends TestScript {

  POST post = new POST();
  GET get = new GET();
  PUT put = new PUT();
  DELETE delete = new DELETE();

  Response response = null;





  public Response create_users(int id,String email,String password,String username) {

    response= post.create_users(this.base_uri(this.path(EndPoint.USERS.getValue())),id,email,password,username);
    return response;
  }


  public Response update_users(int id,String email,String password,String username1,String username) {

    response= put.update_Booking(this.base_uri(this.path(EndPoint.USERS.getValue()+username1)),id,email,password,username);

    return response;
  }




  public Response delete_user(String username) {

    response= delete.delete_bookings(this.base_uri(this.path(EndPoint.USERS.getValue()+username)));
    return response;
  }




  public String get_user_username(String username) {
   String response= get.get_method(this.base_uri(this.path(EndPoint.USERS.getValue())+username));
   return response;
  }
  public String user_login(String username,String password) {

    String query = "username=" + username + "&password=" + password;
    String response= get.get_method(this.base_uri(this.path(EndPoint.LOGIN.getValue()),query));
    return response;
  }

  public String user_logout() {
    String response= get.get_method(this.base_uri(this.path(EndPoint.LOGOUT.getValue())));
    return response;
  }







}
