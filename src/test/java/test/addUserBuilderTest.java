package test;

import io.restassured.response.Response;
import models.addUserPojo;
import models.addUserPojoBuilder;
import org.testng.annotations.Test;
import utils.addUserUtils;


public class addUserBuilderTest {

    @Test
    public void addUserBuilder() {

        //this will create big constructor if payload is big
        //addUserPojoBuilder addUserBuilder = new addUserPojoBuilder("121","addUser","Abhishek","jadhav","INDIA");

        //below will help to add only required fields skip optional fields as well which was not above

        addUserPojoBuilder addUserPojoBuilder = new addUserPojoBuilder.Builder()
                .setUserId("121")
                .setTitle("REST API")
                .setName("Abhishek")
                .setSurname("Jadhav")
                .build();

        //obj from util class which will call the post API
        addUserUtils userUtils = new addUserUtils();
        Response response= userUtils.addUser(addUserPojoBuilder);
        System.out.println("Response is: "+response.asPrettyString());

    }

}
