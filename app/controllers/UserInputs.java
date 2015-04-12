package controllers;

import java.util.List;

import models.RetrieveForm;
import models.UserInput;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import static play.data.Form.*;

public class UserInputs extends Controller {

	public static Result add() {

		UserInput ui = form(UserInput.class).bindFromRequest(request()).get();
		// System.out.println(ui.waterQualityMeasurement);
		ui.save();

		return ok(Json.toJson(ui));

	}

	public static Result list() {
		return ok(Json.toJson(UserInput.find.all()));
	}

	public static Result retrive() {

		RetrieveForm rf = form(RetrieveForm.class).bindFromRequest(request())
				.get();
		System.out.println(rf.lat);
		System.out.println(rf.lon);

		List<UserInput> findList = UserInput.find.where()
				.setFirstRow(rf.offset).setMaxRows(rf.limit).findList();

		return ok(Json.toJson(findList));
	}

}
