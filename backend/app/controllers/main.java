package controllers;

import play.cache.Cache;
import play.mvc.Controller;

public class main extends Controller {

    public static void index(){
        String a = session.get("auth");
        if ( a == null ){
            redirect("/login");
        } else {
            render();
        }
    }
}
