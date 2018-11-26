package com.example.madhav.retro;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface NetworkApi {

    @GET("android/dummy.json")
    Call<Response> getData();



    //call any methods here like @POST , @DELETE etc....

    // all api are called here with their methods
    // @GET("api") Call<Response> getData();
    // make different response class files for the different @GET like for second @GET make second response class file like response2
    // api call methods can have parameters also

    // steps:
    // add dependencies in gradle
    // Create ApiClass or RetrofitClient or Retrofit connection class. This file is same in every case
    // Interface file in which we define all the existing apis with the http request methods (NetworkApi)
    // Response class is the POJO class which is obtained by converting overall JSON response of API into POJO class (Response.java)
    // make sure to take response of every http request and convert it into POJO
    // And datum file created in POJO are arraylist (Data.java)
    // And Example file is the main Response.java file
    /* Always look for keys in the POJO file if keys are same as in the json response then that is the main Response.java file
       and the other Datum file contains the arraylist or objects of the array.
       */

}
