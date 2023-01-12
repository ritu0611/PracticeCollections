package com.test.restAssuredPrac;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class dummytest {
    @Test
    public void dummyTestTocheckConfig(){
        given()
                .when()
                .then();
    }

}
