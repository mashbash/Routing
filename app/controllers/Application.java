package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void newRoster(Long id) {
    	render(id);
    }
    
    public static void roster(String value) {
    	render(value);
    }
    
    public static void saveRoster(String value) {
    	roster(value);
    }
    
}