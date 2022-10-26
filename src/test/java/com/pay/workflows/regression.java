package com.pay.workflows;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.pay.common.framework.test.TestScript;
import com.pay.common.framework.utility.APIRequests;
import com.pay.common.framework.utility.APIResponses;
import com.pay.common.framework.utility.AssertTest;




public class regression extends  TestScript{

    APIRequests request = new APIRequests();
    APIResponses response = new APIResponses();

    String generatedString = RandomStringUtils.randomAlphanumeric(10);
    Random rand = new Random();
    int id = rand.nextInt(100);




    @Test(priority = 1)
    public void user() {
        System.out.println(" STEP01: === Create new Booking");
        response = new APIResponses(request.create_users(id,"owais@sim.com","password",generatedString));
       // displayResponses();
        AssertTest.assertValue(response.status_code(), "200", "FAIL: Unexpected response status", "PASS: Expected response status");
        AssertTest.assertValue(response.getValue("code"), "200", "FAIL: Unexpected response message", "PASS: Expected response message");
        this.id = Integer.parseInt(response.getValue("message"));
        System.out.println("Id == " + id);
   }


    @Test(priority = 2)
    public void update_user() {
        System.out.println(" STEP02: === Update User");
        response = new APIResponses(request.update_users(id,"owais@sim.com","password",generatedString,"ahsan"));
        AssertTest.assertValue(response.status_code(), "200", "FAIL: Unexpected response status", "PASS: Expected response status");

    }


    @Test(priority = 3)
    public void get_user_details() {
        System.out.println(" STEP03: === get user details");
        String str=  request.get_user_username("ahsan");

        AssertTest.assertValue(response.status_code(), "200", "FAIL: Unexpected response status", "PASS: Expected response status");
        AssertTest.assertValue(response.getValue("message"), id, "FAIL: Unexpected response message", "PASS: Expected response message");

    }



    @Test(priority = 4)
    public void user_login() {
        System.out.println(" STEP04: === user login");
        String str=  request.user_login("owais@sim.com","password");
        AssertTest.assertValue(response.status_code(), "200", "FAIL: Unexpected response status", "PASS: Expected response status");

    }





    @Test(priority = 5)
    public void delete_user() {
        System.out.println(" STEP01: === Update User");
        response = new APIResponses(request.delete_user("ahsan"));
        displayResponses();
        AssertTest.assertValue(response.status_code(), "200", "FAIL: Unexpected response status", "PASS: Expected response status");
        AssertTest.assertValue(response.getValue("code"), "200", "FAIL: Unexpected response message", "PASS: Expected response message");

    }




    @Test(enabled = false)
    private void displayResponses() {
    System.out.println("  < Display Request Responses >");
    System.out.println(response.response_body());
    System.out.println(response.status_code());

    }
}




