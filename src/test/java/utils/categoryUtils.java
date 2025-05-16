package utils;

import base.baseService;
import io.restassured.response.Response;

public class categoryUtils extends baseService {

    //create a utils methods here and extend baseService to call get/post operation

    public static final String BASE_PATH = "/products/category";

     //create this method to get all products and call getRequest from baseService
      public Response getSmartPhones(){
       return getRequest(BASE_PATH +"/smartphones");
      }

      //similarly we can create post method to create a new product

}
