package utils;

import base.baseService;
import io.restassured.response.Response;

public class addUserUtils extends baseService {
    public static final String BASE_PATH = "/posts";

    public Response addUser(Object body) {
        return postRequest(body, BASE_PATH + "/add");
    }
}
