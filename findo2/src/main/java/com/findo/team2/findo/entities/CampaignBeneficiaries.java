package com.findo.team2.findo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="CampaignBeneficiaries")
public class CampaignBeneficiaries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cBenID;
	private long donationValue;
	private String name;
	private String address;

	
	@ManyToOne()
	@JoinColumn(name = "campaignID")
	@JsonIgnore
	private Campaigns campaigns;
	
	
	public int getcBenID() {
		return cBenID;
	}

	public void setcBenID(int cBenID) {
		this.cBenID = cBenID;
	}

	public long getDonationValue() {
		return donationValue;
	}

	public void setDonationValue(long donationValue) {
		this.donationValue = donationValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
