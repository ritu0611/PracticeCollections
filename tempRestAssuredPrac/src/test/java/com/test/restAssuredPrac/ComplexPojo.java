package com.test.restAssuredPrac;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class ComplexPojo {

    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    ComplexPojo(){
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io")
                .setContentType(ContentType.JSON);

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder()
                .expectHeader("Content-Type", "application/json").log(LogDetail.ALL)
                .expectStatusCode(200);

        requestSpecification = requestSpecBuilder.build();
        responseSpecification = responseSpecBuilder.build();
    }

    @Test
    public void complex_Pojo_test(){
        tagsMembers tagsMembers = new tagsMembers(234,"puff");
        CategoryMembers categoryMembers = new CategoryMembers(123,"Dog");
        ArrayList<String> photoUrls = new ArrayList<>();
        photoUrls.add("http://google.com");
        ArrayList<tagsMembers> tagsMembersArrayList = new ArrayList<>();
        tagsMembersArrayList.add(tagsMembers);

        Pets pets = new Pets("121","Scooby","available",photoUrls,categoryMembers,tagsMembersArrayList);
       given(requestSpecification).body(pets).
                when().post("/v2/pet").
                then().log().all();

    }
}
