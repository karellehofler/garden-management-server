package models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("profiles")
public class UserProfile {

	@Id
	private String _id;
	private String displayName;
	private String bio;
	private String[] favoritePlants;
	private Date joinDate;
	
	public UserProfile(String _id, String displayName,
			String bio,String[] favoritePlants, Date joinDate) {
		this._id = _id;
		this.displayName = displayName;
		this.bio = bio;
		this.favoritePlants = favoritePlants;
		this.joinDate = joinDate;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String[] getFavoritePlants() {
		return favoritePlants;
	}

	public void setFavoritePlants(String[] favoritePlants) {
		this.favoritePlants = favoritePlants;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	

}
