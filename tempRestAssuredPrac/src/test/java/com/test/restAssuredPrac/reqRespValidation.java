package com.test.restAssuredPrac;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.matchesPattern;

public class reqRespValidation {
    @BeforeClass()
    public void beforeClass(){
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://api.postman.com").
                addHeader("X-Api-Key", "PMAK-636d06dca318f81a4a74f02f-0296c40f710d10ba800e9d11aec27df1a6")
                .setContentType(ContentType.JSON).log(LogDetail.ALL);

        requestSpecification = requestSpecBuilder.build();


        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder.expectStatusCode(200).expectContentType(ContentType.JSON);

        responseSpecification=responseSpecBuilder.build();

    }

    @Test
    public void validate_Post_Req(){

        String payload="{\n" +
                "    \"workspace\": {\n" +
                "        \"name\": \"My Workspace13\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"description\": \"Rest assured Workspace12\"\n" +
                "    }\n" +
                "}";

        given().
                body(payload).
                   when().
                 post("/workspaces").
                then().
                assertThat().
                body("workspace.name",equalTo("My Workspace13")).
                body("workspace.id",matchesPattern("^[a-z-0-9-]{36}$"));

/// non-BDD style

        // you can use given() also instead of with() both are same

//        Response response = RestAssured.with().
//                body(payload).
//                post("/workspaces").then().assertThat()

    }

    @Test
    public void validate_Put_Req(){

        String workspaceId = "eacedf08-4669-4a33-9b34-ef7ab13e82eb";
        String payload="{\n" +
                "    \"workspace\": {\n" +
                "        \"name\": \"newWorkspaceName\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"description\": \"Rest assured newWorkspaceName\"\n" +
                "    }\n" +
                "}";

        given().
                body(payload).
                pathParam("workspaceId",workspaceId).
                when().
                put("/workspaces/{workspaceId}").
                then().
                assertThat().
                body("workspace.name",equalTo("newWorkspaceName"),
                        "workspace.id",matchesPattern("^[a-z-0-9-]{36}$"),
                        "workspace.id",equalTo(workspaceId)

                );

    }
}
