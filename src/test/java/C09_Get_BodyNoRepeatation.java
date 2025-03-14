import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C09_Get_BodyNoRepeatation {
    @Test
    public void test01() {
        /*
        https://restful-booker.herokuapp.com/booking/10 url'ine
        bir GET request gonderdigimizde donen Response' un,
        status code' unun 200,
        ve content type'inin application-json,
        ve response body' sindeki
        "firstname"in, "Susan",
        ve "Lastname"in, "Jackson",
        ve "totalprice"in, 612,
        ve "depositpaid"in, false,
        ve "additionalneeds"in, "Breakfast"
        oldugunu test edin
        */

        // 1- endpoint ve request body hazirla
        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2- expected data olustur

        // 3- Request gonderip donen response'i kaydet
        Response response = given().when().get(url);

        // 4- Assertion
        response.prettyPrint();
        /*
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("firstname", Matchers.equalTo("Jim"))
                .body("lastname", Matchers.equalTo("Smith"))
                .body("totalprice", Matchers.lessThan(1000))
                .body("depositpaid", Matchers.equalTo(true));
                .body("additionalneeds", Matchers.equnotNullValue());
                */

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("firstname", equalTo("Eric"),
                        "lastname", equalTo("Brown"),
                        "totalprice", lessThan(1000),
                        "depositpaid", equalTo(false),
                        "additionalneeds", notNullValue());

    }
}
