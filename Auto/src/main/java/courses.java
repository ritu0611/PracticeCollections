import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class courses {

    int sum =0;

    public static String  getJSon(){

        return  "{\n" +
                "  \"dashboard\": {\n" +
                "    \"purchaseAmount\": 910,\n" +
                "    \"website\": \"rahulshettyacademy.com\"\n" +
                "  },\n" +
                "  \"courses\": [\n" +
                "    {\n" +
                "      \"title\": \"Selenium Python\",\n" +
                "      \"price\": 50,\n" +
                "      \"copies\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Cypress\",\n" +
                "      \"price\": 40,\n" +
                "      \"copies\": 4\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"RPA\",\n" +
                "      \"price\": 45,\n" +
                "      \"copies\": 10\n" +
                "    }\n" +
                "  ]\n" +
                "}";

    }

    @Test

    public  void courseOps(){

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        JsonPath js = new JsonPath(getJSon());

        int count = js.getInt("courses.size()");

        System.out.println((js.getInt("courses.size()")));

        System.out.println((js.getInt("dashboard.purchaseAmount")));

        System.out.println((js.get("courses[0].title").toString()));

        for (int i=0; i<=count; i++){

            String Title =js.get("courses["+i+"].title");
            if (Title.equalsIgnoreCase("RPA")){
                System.out.println(Title);
                // no. of copies
               int copies = js.get("courses["+i+"].copies");
               System.out.println("No. of RPA copies:" + copies);
                break;
            }




            //System.out.println(js.get("courses["+i+"].price").toString());
        }







    }

    @Test

    public  void sumLogic(){
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        JsonPath js = new JsonPath(getJSon());

        int count = js.getInt("courses.size()");
        for (Integer j=0; j<=count; j++){


                Integer copies = js.get("courses[" + j + "].copies");
                Integer price = js.get("courses[" + j + "].price");
                if(copies != null && price != null ) {
                    Integer amount = copies * price;
                    sum = sum + amount;
                    continue;
                }
            break;
        }

        System.out.println(sum);

        int purchaseAmount =js.getInt("dashboard.purchaseAmount");
        Assert.assertEquals(sum, purchaseAmount);



    }
}
