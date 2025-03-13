import org.json.JSONObject;
import org.junit.Test;

public class C05_CreateJsonObject {
    @Test
    public void test01() {

       /* {
            "firstname" : "Jim",
                "additionalneeds" : "Breakfast",
                "bookingdates" : {
                    "checkin" : "2018-02-03",
                    "checkout" : "2011-05-01"
        },
            "totalprice" : 134,
                "depositpaid" : true,
                "lastname" : "Brown",
        }
*/
        //once inner json objesini olusturalim

        JSONObject dateJsonObject = new JSONObject();
        dateJsonObject.put("checkin", " 2018-01-01");
        dateJsonObject.put("checkout", " 2019-01-01");

        // sonra outer json objesini olusturup, yeri geldiginde inner objeyi koyalim
        JSONObject requestBody = new JSONObject();
        requestBody.put("firstname", "Seval");
        requestBody.put("additoinalneeds", "Breakfast");
        requestBody.put("bookingdates", dateJsonObject);
        requestBody.put("totalprice", 134);
        requestBody.put("depositpaid", true);
        requestBody.put("lastname", "Brown");
        System.out.println(requestBody);

        /*
        {"firstname":"Seval","bookingdates":
        {"checkin":" 2018-01-01","checkout":" 2019-01-01"},

        "totalprice":134,
        "additoinalneeds":"Breakfast",
        "depositpaid":true,
        "lastname":"Brown"
        }
        */
    }
}
