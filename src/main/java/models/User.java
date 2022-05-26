package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document("users")
public class User {
	
	@Id
	private String _id;
	private String email;
	private String password;
	private String phone;
	private Date joinedAt;
	private UserProfile profile;
	
	public User(String _id, String email, String password, 
			String phone, Date joinedAt, UserProfile profile) {
		this._id = _id;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.joinedAt = joinedAt;
		this.profile = profile;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(Date joinedAt) {
		this.joinedAt = joinedAt;
	}	

}
