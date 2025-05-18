package test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.addUserUtils;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;

public class addUserTest2 {

    //this test is to show that if you have one key value only in post payload then no need for POJO
//    {
//        "name": "Abhishek"
//    }
    @Test
    public void addTest2() {

 // if you have only one of max 2 object in pyaload do with below apporach no need for pojo
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId", 123);
        map.put("name", "Abhishek");

        addUserUtils utils = new addUserUtils();
        Response response= utils.addUser(map);
        System.out.println("Response code is: "+response.asPrettyString());

        assertEquals(response.jsonPath().getString("userId"), "123");

    }

}
