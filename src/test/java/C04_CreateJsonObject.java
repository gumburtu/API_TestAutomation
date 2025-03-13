import org.json.JSONObject;
import org.junit.Test;

public class C04_CreateJsonObject {
    @Test
    public void test01() {
        /*
            "title" : "Ahmet",
            "body" : "Merhaba",
            "uderId" : 1,
         */

        JSONObject object1 = new JSONObject();

        object1.put("title", "Ahmet");
        object1.put("body", "Merhaba");
        object1.put("userId", 1);

        System.out.println("object1 = " + object1);
    }
}
