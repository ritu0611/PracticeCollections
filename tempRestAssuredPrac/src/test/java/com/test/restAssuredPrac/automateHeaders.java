package com.test.restAssuredPrac;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class automateHeaders {
    @Test
    public void validate_Req_headers(){

        HashMap<String,String> reqHeaders = new HashMap<>();
        reqHeaders.put("header","Value2");
        reqHeaders.put("x-mock-match-request-headers","header");
         given()
                .baseUri("https://f0569949-41ce-49e8-bd4f-bcf85fe5f862.mock.pstmn.io")
                 .headers("header","Value2","x-mock-match-request-headers","header")  // metho-2
                .headers(reqHeaders).log().all()

                .when()
                .get("/get")


                .then()
                .assertThat().statusCode(200);

    }

    @Test
    public void validateMultivalue_Req_headers(){

        Header multiHeader1 = new Header("multiValueHeader","Value3");
        Header multiHeader2 = new Header("multiValueHeader","Value4");
        Header multiHeader3 = new Header("multiValueHeader","Value5");

        Headers multiValueHeaders = new Headers(multiHeader1,multiHeader2,multiHeader3);
        given()
                .baseUri("https://f0569949-41ce-49e8-bd4f-bcf85fe5f862.mock.pstmn.io")
                //.header("header","Value2").header("multiValueHeader","Value3","Value4","Value5")    // method-1
                .header("x-mock-match-request-headers","header")
                .header("header","Value2")
                .headers(multiValueHeaders)        // method2
                .log().headers()

                .when()
                .get("/get")


                .then()
                .assertThat().statusCode(200).log().all();

    }

    @Test
    public void validateResponseHeaders(){

         HashMap<String,String> reqHeaders = new HashMap<>();
         reqHeaders.put("header","Value2");
         reqHeaders.put("x-mock-match-request-headers","header");


         Headers resHeaders = given()
                .baseUri("https://f0569949-41ce-49e8-bd4f-bcf85fe5f862.mock.pstmn.io")
                .headers(reqHeaders)

                .when()
                 .get("/get")

                .then()
                 .assertThat().statusCode(200)
                 .log().headers().extract().headers();

         for (Header header : resHeaders){

             System.out.println(header.getName() +": " +header.getValue());

         }

    }

}

