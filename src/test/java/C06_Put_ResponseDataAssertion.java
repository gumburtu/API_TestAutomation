import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C06_Put_ResponseDataAssertion {
    @Test
    public void test01() {

    /*
     https://jsonplaceholder.typicode.com/posts/70 url'ine asagidaki Json formatindaki body ile bir PUT request gonderdigimizde
     {
      "title": "Ahmet",
      "body" : "Merhaba"
      "userId" : 10,
      "id":70
    }

    donen Response' un,
        status code' unun 200,
        ve content type'inin application/json; charset=utf-8,
        ve Server isimli Header'in degerinin cloudflare,
        ve status Line' in HTTP/1.1 200 0K
    */

        // 1- end point ve request body hazirla
        String url = "https://jsonplaceholder.typicode.com/posts/70";

        JSONObject requestbody = new JSONObject();
        requestbody.put("title", "Seval");
        requestbody.put("body", "Selamlar");
        requestbody.put("userId", 10);
        requestbody.put("id", 70);

        // 2- expected body olustur

        // 3- request gonder bve donen response'i kaydet

        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .body(requestbody.toString())
                .put(url);

        response.prettyPrint();

        // 4- Assertions

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server", "cloudflare")
                .statusLine("HTTP/1.1 200 OK");
    }
}
