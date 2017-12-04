package controllers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import play.mvc.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class login extends Controller{

    public static void index(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.body));
        JsonObject jsonObject = new Gson().fromJson(reader, JsonObject.class);
        if ( jsonObject == null){
            render();
        } else if ( jsonObject.get("user").getAsString().contentEquals("a") &&
                jsonObject.get("pass").getAsString().contentEquals("a")){
            session.put("auth","bla");
            jsonObject.addProperty("token",true);
            renderJSON(jsonObject);
        } else {
            render();
        }
    }
}