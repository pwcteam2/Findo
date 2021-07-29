//package com.findo.team2.findo.entities;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//public class CampaignThemes {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int ctID;
//	private int campaignID;
//	
//	@ManyToOne()
//	@JoinColumn(name = "themeID")
//	@JsonIgnore
//	private Themes theme;
//
//	public int getCtID() {
//		return ctID;
//	}
//
//	public void setCtID(int ctID) {
//		this.ctID = ctID;
//	}
//
//	public int getCampaignID() {
//		return campaignID;
//	}
//
//	public void setCampaignID(int campaignID) {
//		this.campaignID = campaignID;
//	}
//
//}
