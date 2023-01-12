package com.test.restAssuredPrac;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static io.restassured.RestAssured.*;

public class query_PathParameter {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;

    query_PathParameter() {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder().setBaseUri("https://postman-echo.com");
        requestSpecification = requestSpecBuilder.build();

        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder().expectContentType(ContentType.JSON);
        responseSpecification = responseSpecBuilder.build();
    }

    @Test
    public void queryTest() {
        given(requestSpecification)
                        .queryParam("username","ritu").
                when().get("/get").
                then().spec(responseSpecification).assertThat().statusCode(200).log().all();
    }

    @Test
    public void multiple_Query_Test(){
        HashMap<String,Object> queryParams = new HashMap<>();
        queryParams.put("username","ritu");
        queryParams.put("pasword","ritzzy");
        queryParams.put("age",23);

        given(requestSpecification)
                .queryParams(queryParams).
                when().get("/get")
                .then().spec(responseSpecification).assertThat().statusCode(200);
    }

    @Test
    public void multiValue_Query_Test(){
        given(requestSpecification)
                .queryParam("type","text","JSON","HTML","PDF").
                when().get("/get")
                .then().spec(responseSpecification).assertThat().statusCode(200);
    }

    @Test
    public void post_Param_Test(){
       /* LinkedHashMap<String,Object> pathParams = new LinkedHashMap<>();
        pathParams.put("foo","bar1");
        pathParams.put("foo1","bar2");*/
        given().
                baseUri("https://reqres.in").pathParam("userId","2").log().all().
//                .pathParams(pathParams)
                when().get("/api/users/{userId}")  //...../{foo}/{foo1}
                .then().assertThat().statusCode(200).log().all();
    }

    @Test
    public void multipart_Test(){
        given(requestSpecification)
                .queryParam("username","ritu").
                multiPart("type","texts").log().all().
                when().get("/get")
                .then().spec(responseSpecification).assertThat().statusCode(200).log().all();

    }

    @Test
    public void uploadFile_form_data(){
        String attributes = "{\"name\":\"test.txt\",\"parent\":{\"id\":\"1234567890\"}}";
        given(requestSpecification).
                multiPart("file",new File("test.txt"))
                        .multiPart("attributes",attributes).log().all().

                when().post("/post").

                        then().log().all().assertThat().statusCode(200);

    }

    @Test
    public void download_File_form_data() throws IOException {

        InputStream in = given().baseUri("https://github.com").log().all().
                when().get("/freeautomationlearning/Appium/blob/master/app/ApiDemos.apk").

                then().log().all().extract().asInputStream();

        OutputStream os = new FileOutputStream("ApiDemos.apk");
        byte[] bytes = new byte[in.available()];
        os.write(bytes);
        os.close();

    }

    @Test
    public void form_URL_Encoded_Test(){

        given(requestSpecification).
                formParam("test1","value1").
                formParam("test2","value2").
                formParam("test3","value3").

                // by default RestAssured sent in response charset=utf-8
                // so in order to ignore encoding we have to write below LOC
                // i.e if charset is not defined by api then Rest Assured shouldn't
                        // provide default content type by making it false
                config(config().encoderConfig(EncoderConfig.encoderConfig()
                        .appendDefaultContentCharsetToContentTypeIfUndefined(false))).
                log().all().

                when().post("/post").

                then().log().all().assertThat().statusCode(200);

    }

}
