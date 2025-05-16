package base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class baseService {
    //create baseRUI
    //create getRequest
    //create postRequest

    private static final String BASE_URL = "https://dummyjson.com/";
    private RequestSpecification requestSpecification;

    public baseService() {
        requestSpecification = given().baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }

    protected Response getRequest(String endpoint) {
        return requestSpecification.get(endpoint);

    }

    protected Response postRequest(Object body,String endpoint) {
        return requestSpecification.body(body).post(endpoint);
    }
}
