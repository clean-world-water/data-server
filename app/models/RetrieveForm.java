package models;

import java.util.Date;

import play.data.format.Formats.DateTime;

public class RetrieveForm {

	// public Date createdAt;
	// public Date updatedAt;

	public Double lat;
	public Double lon;

	public Integer offset = 0;
	public Integer limit = 1000;

	@DateTime(pattern = "yyyy-MM-dd-hh")
	public Date startAt = new Date(0);

}
