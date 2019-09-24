package edu.sabanciuniv.berry.domain;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "user")
public class User{

	 private String firstName;
	 private String lastName;
	 private String email;
	 
	 @NotBlank(message = "Username can not be null!")
	 @Id
	 private String username;
	 @NotBlank(message = "Password can not be null!")
	 private String password;
	 
	 private String schoolID;
	 private boolean enabled=true;
	 
	 private String userImage;
	 
	 @OneToMany(mappedBy = "user")
	 private List<Follower> followers;


	public User() {
		super();
	}

	public User(String firstName, String lastName, String email, String username, String password,
			String schoolID, boolean enabled,String userImage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.schoolID = schoolID;
		this.enabled = enabled;
		this.userImage = userImage;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(String schoolID) {
		this.schoolID = schoolID;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public List<Follower> getFollowers() {
		return followers;
	}

	public void setFollowers(List<Follower> followers) {
		this.followers = followers;
	}


}
