package com.restAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class dummyTest {

    @Test
    public void dummyTestTocheckConfig(){
        given()
                .when()
                .then();
    }

}
