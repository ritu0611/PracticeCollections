package com.test.restAssuredPrac;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test {
    @org.testng.annotations.Test
    public void test() {
        given().
                baseUri("https://api.postman.com")
                .header("X-Api-Key", "PMAK-636d06dca318f81a4a74f02f-0296c40f710d10ba800e9d11aec27df1a6")
       .when()
                .get("/workspaces")
       .then()
                .assertThat()
                .statusCode(200)
                .log().all();
    }

    @org.testng.annotations.Test
    public void verify_ResponseBody(){
        given()
                .baseUri("https://api.postman.com")
                .header("X-Api-Key", "PMAK-636d06dca318f81a4a74f02f-0296c40f710d10ba800e9d11aec27df1a6")
                .when()
                .get("/workspaces")
                .then()
                .assertThat()
                /**
                 * hamcrest is a default assertion comes with rest-assured
                 * it uses Gpath, groovy language
                 * */
                .body("workspaces.name",hasItems("My Workspace","Team Workspace","MyWorkSpace2"),
                        "workspaces.type", hasItems("personal","team","team"),
                        "workspaces.size()",equalTo(3)
                )
                .statusCode(200)
                .log().all();;

    }

    @org.testng.annotations.Test
    public void extract_Response(){
        Response res = given()
                .baseUri("https://api.postman.com")
                .header("X-Api-Key", "PMAK-636d06dca318f81a4a74f02f-0296c40f710d10ba800e9d11aec27df1a6")
         .when()
                .get("/workspaces")
         .then()
                .assertThat()
                .statusCode(200)
                .extract().response();
        System.out.println(res.prettyPrint());
    }
    @org.testng.annotations.Test
    public void extractSingleField_Response(){
        Response res = given()
                .baseUri("https://api.postman.com")
                .header("X-Api-Key", "PMAK-636d06dca318f81a4a74f02f-0296c40f710d10ba800e9d11aec27df1a6")
          .when()
                .get("/workspaces")
          .then()
                .assertThat()
                .statusCode(200)
                .extract().response();// or we can use this path function directly ".path("workspaces")"and print it
        System.out.println(res.prettyPrint());
        System.out.println("Using GSON: Workspace name is " +res.path("workspaces[0].name")); // using GSON groovy method
        JsonPath jp = new JsonPath(res.asString());
        System.out.println("Using JSONpath class and object,: Workspace type is: "
                +jp.get("workspaces[0].type")); // using jspoth class and object

        System.out.println("Directly using JsonpathFunction, Workspace id is"
                +JsonPath.from(res.asString()).get("workspaces[0].id")); // directly using jsonpath function



    }
}
