package controllers;

import models.UserInput;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	// public static Result index() {
	// return ok(index.render("Your new application is ready."));
	// }

	public static Result index() {
		return ok(index.render(UserInput.find.all()));
	}

	public static Result javascriptRoutes(){
		response().setContentType("text/javascript");
		return ok(
				Routes.javascriptRouter("jsRoutes", 
						controllers.routes.javascript.UserInputs.add(),
						controllers.routes.javascript.UserInputs.list()
						)
				
				);
	}
	
}
