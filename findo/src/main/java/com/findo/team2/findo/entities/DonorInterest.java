package com.findo.team2.findo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DonorInterest")
public class DonorInterest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int donorInterestID;
	// private int themeID;
//	private int donorID;
	@Column(name = "budgetedValue")
	private int budgetedValue;

	@ManyToOne()
	@JoinColumn(name = "donorID")
	@JsonIgnore
	private Donor donor;

	@ManyToOne(targetEntity = Themes.class)
	@JoinColumn(name = "themeID")
	@JsonIgnore
	private Themes theme;

	public int getDonorInterestID() {
		return donorInterestID;
	}

	public void setDonorInterestID(int donorInterestID) {
		this.donorInterestID = donorInterestID;
	}

//	public int getThemeID() {
//		return themeID;
//	}
//
//	public void setThemeID(int themeID) {
//		this.themeID = themeID;
//	}

//	public int getDonorID() {
//		return donorID;
//	}
//
//	public void setDonorID(int donorID) {
//		this.donorID = donorID;
//	}

	public long getBudgetedValue() {
		return budgetedValue;
	}

	public void setBudgetedValue(int budgetedValue) {
		this.budgetedValue = budgetedValue;
	}

}
