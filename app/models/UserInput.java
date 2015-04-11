package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import play.db.ebean.Model;

@Entity
public class UserInput extends Model {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;

	public Date createdAt;
	public Date updatedAt;

	@Version
	public int version;
	public Double lat;
	public Double lon;
	public String waterQualityMeasurement;
	public String waterMeasurementTool;
	public String waterInfrastructure;

	public String waterSourceImageURL;
	public String waterInfrastructureImageURL;

	public static Finder<Long, UserInput> find = new Finder<>(Long.class,
			UserInput.class);

	public static UserInput create(Double lat, Double lon, String wqm,
			String wmt, String wi, String wsiUrl, String wiiUrl) {
		UserInput ui = new UserInput();
		ui.lat = lat;
		ui.lon = lon;
		ui.waterQualityMeasurement = wqm;
		ui.waterMeasurementTool = wmt;
		ui.waterInfrastructure = wi;
		ui.waterSourceImageURL = wsiUrl;
		ui.waterInfrastructureImageURL = wiiUrl;

		ui.save();

		return ui;

	}

}
