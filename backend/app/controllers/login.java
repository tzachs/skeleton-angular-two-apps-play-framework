package controllers;

import play.cache.Cache;
import play.mvc.Controller;

public class login extends Controller{
    public static void login(){
        session.put("auth","bla");
        Cache.set(session.getId() + "-auth",  System.currentTimeMillis());
        render();
    }
}
