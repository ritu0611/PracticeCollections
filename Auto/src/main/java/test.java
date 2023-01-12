import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {

 @Test

    public  void addLocation() throws IOException {

     RestAssured.baseURI = "https://rahulshettyacademy.com";
     String response = given().log().all().header("Content-Type","application/json").queryParam("key","qaclick123")
             .body(new String(Files.readAllBytes(Path.of("src/main/resources/Templates/AddLocation.json"))))
             .when().post("/maps/api/place/add/json")
             .then().assertThat().statusCode(200).header("Server","Apache/2.4.18 (Ubuntu)").
             body("scope", equalToIgnoringWhiteSpace("APP")).extract().response().
             asString();
     System.out.println(response);
     JsonPath js = new JsonPath(response);
     String placeID = js.getString("place_id");
     System.out.println(placeID);

     given().header("Content-Type", "application/json").queryParam("key","qaclick123")
             .body("{\n" +
                     "\"place_id\":\""+placeID+"\",\n" +
                     "\"address\":\"70 Summer walk, USA\",\n" +
                     "\"key\":\"qaclick123\"\n" +
                     "}\n")
             .when().put("maps/api/place/update/json").then().assertThat().statusCode(200);

     given().header("Content-Type", "application/json").queryParam("key","qaclick123")
             .queryParam("place_id", placeID)
             .when().get("/maps/api/place/get/json").then().assertThat().statusCode(200);
 }
}


