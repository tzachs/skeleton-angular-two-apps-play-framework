package controllers;

import play.mvc.Controller;

public class main extends Controller{

    public static void index(){
        String auth = session.get("auth");
        if ( auth == null){
            redirect("/login");
        }
        render();
    }
}