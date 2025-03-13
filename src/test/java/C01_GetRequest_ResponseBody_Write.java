import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_GetRequest_ResponseBody_Write {
    @Test
    public void get01() {
        // https://restful-booker.herokuapp.com/booking/10 url'sine

        //bir get request gonderdigimizde donen responsu'i yazdiriniz.

        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 1- Request body ve end -point hazirlama

        // 2- Expected data hazirlama

        // 3- Request gonderip, donen response'i kaydetme

        Response response = given().when().get(url);
        response.prettyPrint();

        // 4- Assertion
    }
}
