package controllers;

import models.UserInput;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import static play.data.Form.*;

public class UserInputs extends Controller {

	public static Result add() {
		UserInput userInput = new UserInput();

		String wqm = form().bindFromRequest().get("waterQualityMeasurement");
		System.out.println(wqm);

		return ok(index.render(UserInput.find.all()));

	}

	public static Result list() {
		return ok(Json.toJson(UserInput.find.all()));
	}

}
