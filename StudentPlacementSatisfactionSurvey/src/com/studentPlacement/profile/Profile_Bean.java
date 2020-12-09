package com.studentPlacement.profile;

public class Profile_Bean {
	private String user_name;
	private String email;
	private String profile_picture;
	private String id;
	
	// This is where I declare the variables about the data
	//to get from the facebook profile of the student user.
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}