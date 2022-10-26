package com.pay.common.framework.utility;

import com.pay.common.framework.test.TestScript;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT extends TestScript {
    public Response update_Booking(String uri,int id,String email,String password,String username) {
        RestAssured.baseURI = uri;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(update_user(id,email,password,username));
        return httpRequest.put();

    }

}
