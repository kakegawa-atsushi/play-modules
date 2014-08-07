package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import models.User;

public class Application extends Controller {

    public static Result index() {
        User user = new User();
        return ok(index.render("Your new application is ready."));
    }

}
