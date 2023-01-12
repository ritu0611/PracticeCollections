package com.test.restAssuredPrac;

import com.beust.ah.A;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.matchesPattern;

public class jsonValidation {
    @BeforeClass()
    public void beforeClass() {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://f0569949-41ce-49e8-bd4f-bcf85fe5f862.mock.pstmn.io").
                addHeader("Content-Type", "application/json")
                .addHeader("x-mock-match-request-body","true")
                .setContentType(ContentType.JSON).log(LogDetail.ALL);

        requestSpecification = requestSpecBuilder.build();


        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecBuilder.expectStatusCode(200).expectContentType(ContentType.JSON);

        responseSpecification = responseSpecBuilder.build();


    }


    @Test
    public void file_Example() {

        File file = new File("src/main/resources/createMyWorkspace.json");
        given().
                body(file).
                when().
                post("/workspaces").
                then().log().all().
                assertThat().
                body("workspace.name", equalTo("My Workspace18"));
    }

    @Test
    public void test_Complex_Json() {

        ArrayList<Integer> batterElement2ID = new ArrayList<>();
        batterElement2ID.add(5);
        batterElement2ID.add(9);

        HashMap<String, Object> batterElement2Obj = new HashMap<>();
        batterElement2Obj.put("id", batterElement2ID);
        batterElement2Obj.put("type", "Chocolate");

        HashMap<String, Object> batterElement1Obj = new HashMap<>();
        batterElement1Obj.put("id", "1001");
        batterElement1Obj.put("type", "Regular");

        ArrayList<HashMap<String, Object>> batterArrayList = new ArrayList<>();
        batterArrayList.add(batterElement1Obj);
        batterArrayList.add(batterElement2Obj);


        HashMap<String, List<HashMap<String, Object>>> battersFinalObject = new HashMap<>();
        battersFinalObject.put("batter", batterArrayList);

        // toppings object

        ArrayList<String> toppingElement2Type = new ArrayList<>();
        toppingElement2Type.add("test1");
        toppingElement2Type.add("test2");

        HashMap<String, Object> toppingElement2Obj = new HashMap<>();
        toppingElement2Obj.put("id", "5002");
        toppingElement2Obj.put("type", toppingElement2Type);

        HashMap<String, Object> toppingElement1Obj = new HashMap<>();
        toppingElement1Obj.put("id", "5001");
        toppingElement1Obj.put("type", "None");

        ArrayList<HashMap<String, Object>> toppingFinalArray = new ArrayList<>();
        toppingFinalArray.add(toppingElement1Obj);
        toppingFinalArray.add(toppingElement2Obj);

//  constructing main object

        HashMap<String, Object> mainHashMap = new HashMap<>();
        mainHashMap.put("id", "002");
        mainHashMap.put("type", "donut");
        mainHashMap.put("name", "cake");
        mainHashMap.put("ppu", 0.55);
        mainHashMap.put("batters", battersFinalObject);
        mainHashMap.put("topping", toppingFinalArray);


        given().
                body(mainHashMap).
                when().
                post("/postComplexJson").
                then().log().all().
                assertThat().statusCode(200);


    }

    @Test
    public void test_Complex_Colors_Json() {

        //Color Obj1
        ArrayList<Integer> rgba1 = new ArrayList<>();
        rgba1.add(255);
        rgba1.add(255);
        rgba1.add(255);
        rgba1.add(1);

        HashMap<String,Object> rgba1Obj = new HashMap<>();
        rgba1Obj.put("rgba", rgba1);

        HashMap<String, Object> code1 = new HashMap<>();
        code1.put("rgba",rgba1Obj);
        code1.put("hex","#000");

        HashMap<String, Object> colorObj1 = new HashMap<>();
        colorObj1.put("color","black");
        colorObj1.put("category","hue");
        colorObj1.put("type","primary");
        colorObj1.put("code",code1);


        //Color Obj2
        ArrayList<Integer> rgba2 = new ArrayList<>();
        rgba2.add(0);
        rgba2.add(0);
        rgba2.add(0);
        rgba2.add(1);

        HashMap<String,Object> rgba2Obj = new HashMap<>();
        rgba2Obj.put("rgba", rgba2);

        HashMap<String, Object> code2 = new HashMap<>();
        code2.put("rgba",rgba2Obj);
        code2.put("hex","#FFF");

        HashMap<String, Object> colorObj2 = new HashMap<>();
        colorObj2.put("color","white");
        colorObj2.put("category","value");
        colorObj2.put("code",code2);

        ArrayList<HashMap<String,Object>> mainAL = new ArrayList<>();
        mainAL.add(colorObj1);
        mainAL.add(colorObj2);

        HashMap<String,ArrayList<HashMap<String,Object>>> colorFinalMap = new HashMap<>();
        colorFinalMap.put("colors",mainAL);


        given().spec(requestSpecification).body(colorFinalMap)
                .when()
                .post("/postcolors").then().assertThat().statusCode(200);


    }


}
