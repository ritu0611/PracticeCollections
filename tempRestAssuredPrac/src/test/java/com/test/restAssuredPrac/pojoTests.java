package com.test.restAssuredPrac;

import com.rest.pojo.*;
import com.rest.pojo.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

public class pojoTests {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;

    pojoTests(){
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder().setBaseUri("https://api.postman.com")
                .addHeader("Content-Type", "application/json")
                .addHeader("X-Api-Key","PMAK-636d06dca318f81a4a74f02f-0296c40f710d10ba800e9d11aec27df1a6");

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder().expectContentType(ContentType.JSON);
        requestSpecification = requestSpecBuilder.build();
        responseSpecification = responseSpecBuilder.build();
    }

    @Test
    public void create_Workspace_Pojo(){

        createWorkspace createWorkspace = new createWorkspace("Workspace11","Personal","MyWorkspace");
        createWorkspaceRoot root = new createWorkspaceRoot(createWorkspace);
        createWorkspaceRoot deserializedObj = given(requestSpecification).log().all().
                when().post("/workspace").
                then().log().all()
                .extract().response()
                .as(createWorkspaceRoot.class);

        Assert.assertEquals(deserializedObj.getWorkspace().getName(),root.getWorkspace().getName());
        Assert.assertEquals(deserializedObj.getWorkspace().getId(), Pattern.compile("^[a-z-0-9-]{36}$").matcher(deserializedObj.getWorkspace().getId()).toString());
    }

    @Test
    public void jsonPlaceholderExample1_Test(){
        geo geoObj = new geo("-37.315","81.1496");
        address addressObj = new address("Kulas Light","234","Gwenborough","92998-3874",geoObj);
        parentJson parentJsonObj = new parentJson("Ritu Tivari","ritx","Sincere@april.biz",addressObj);
        given().baseUri("https://jsonplaceholder.typicode.com").contentType(ContentType.JSON).
        body(parentJsonObj).log().all().
                when().post("/users").
                then().statusCode(201).contentType(ContentType.JSON).log().all();
    }
}
