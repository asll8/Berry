package edu.sabanciuniv.berry.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "note")
public class Note {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable = false, updatable=false)
	private int id;
	@Column(name="coursename")
	private String courseName;
	@Column(name="courseid")
	private String courseID;
	@Column(name="year")
	private String year;
	@Column(name="semester")
	private String semester;
	@Column(name="userid")
	private String userID;//it should be userID
	@Column(name="schoolid")
	private String schoolID;
	@Column(name="attachment")
	private String attachment;
	
	
	public Note() {
		super();
	}

	public Note(int id, String courseName, String courseID, String year, String semester, String userID, String schoolID,String attachment) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseID = courseID;
		this.year = year;
		this.semester = semester;
		this.userID = userID;
		this.schoolID=schoolID;
		this.attachment=attachment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
	

	public String getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(String schoolID) {
		this.schoolID = schoolID;
	}
	

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	


	@Override
	public String toString() {
		return "Note [id=" + id + ", courseName=" + courseName + ", courseID=" + courseID + ", year=" + year
				+ ", semester=" + semester + ", userID=" + userID + ", schoolID=" + schoolID + ", attachment="
				+ attachment + "]";
	}


	
}
