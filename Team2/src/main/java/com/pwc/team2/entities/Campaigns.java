package com.pwc.team2.entities;

import javax.persistence.Entity;

@Entity
public class Campaigns {
  
	private String Name;
	private String ImageURL;
	private String message;
	private int TargetDonation;
	private String Start_Date;
	private String End_Date;
	private String Status;
	private String CreatedBy;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getImageURL() {
		return ImageURL;
	}
	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getTargetDonation() {
		return TargetDonation;
	}
	public void setTargetDonation(int targetDonation) {
		TargetDonation = targetDonation;
	}
	public String getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}
	public String getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	@Override
	public String toString() {
		return "Campaigns [Name=" + Name + ", ImageURL=" + ImageURL + ", message=" + message + ", TargetDonation="
				+ TargetDonation + ", Start_Date=" + Start_Date + ", End_Date=" + End_Date + ", Status=" + Status
				+ ", CreatedBy=" + CreatedBy + "]";
	}
	
	

}
