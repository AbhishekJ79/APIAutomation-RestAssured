package test;

import io.restassured.response.Response;
import jdk.jfr.Category;
import models.addUserPojo;
import org.testng.annotations.Test;
import utils.addUserUtils;

public class addUserTest {

    @Test
    public void addUser() {

        //create object of pojo class and pass the values

        addUserPojo user = new addUserPojo("121","addUser","Abhishek","jadhav","INDIA");

        //create object of utils class and call the method and pass the pojo object
        addUserUtils userUtils = new addUserUtils();
       Response response= userUtils.addUser(user);
       System.out.println("Response is: "+response.asPrettyString());
    }
}
