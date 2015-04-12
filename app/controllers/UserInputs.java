package controllers;

import static play.data.Form.form;

import java.util.Date;
import java.util.List;

import models.RetrieveForm;
import models.UserInput;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

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
		System.out.println(rf.startAt);

		List<UserInput> findList = UserInput.find.where()
				.between("createdAt", rf.startAt, new Date())
				.setFirstRow(rf.offset).setMaxRows(rf.limit).findList();

		return ok(Json.toJson(findList));
	}

}
