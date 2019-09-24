package edu.sabanciuniv.berry.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "follower")
public class Follower {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int followerId;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Follower() {
		// TODO Auto-generated constructor stub
	}

	public Follower(User user) {
		super();
		this.user = user;
	}

	public int getFollowerId() {
		return followerId;
	}

	public void setFollowerId(int followerId) {
		this.followerId = followerId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}