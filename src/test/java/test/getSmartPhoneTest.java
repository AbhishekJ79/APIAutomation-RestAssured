package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.categoryUtils;

import static org.testng.Assert.assertEquals;

public class getSmartPhoneTest {

    @Test
    public void testSmartPhone() {
        categoryUtils category = new categoryUtils();
        Response response=category.getSmartPhones();
        System.out.println(response.asPrettyString());
        System.out.println("Status code is: "+response.getStatusCode());
        assertEquals(response.getStatusCode(), 200);

        // Validate the response body
        assertEquals(response.jsonPath().getString("products[0].title"), "iPhone 5s");


    }

}
