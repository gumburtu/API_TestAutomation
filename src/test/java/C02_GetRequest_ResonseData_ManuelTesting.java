import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_GetRequest_ResonseData_ManuelTesting {
    @Test
    public void test01() {
      /*
        This project aims to access and manage student information by establishing a connection to a relational database. It involves designing an efficient database schema to store student data, implementing CRUD (Create, Read, Update, Delete) operations, and ensuring data integrity.
       */

        // 1- Gerekli body ve end-point hazirla
        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2- Expected body olustur


        // 3- Request gonder ve donen response'i kaydet
        Response response = given().when().get(url);

        response.prettyPrint();

        System.out.println("Status Code = " + response.getStatusCode() +
                "\nContent Type = " + response.getContentType() +
                "\nServer Header = " + response.getHeader("Server") +
                "\nStatus Line = " + response.getStatusLine() +
                "\nResponse Time = " + response.getTime());


    }
}
