package com.findo.team2.findo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CampaignDonations")
public class CampaignDonations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int receiptID;
	private Date date;
	private long donationValue;
	private String paymentDetails;

	@ManyToOne()
	@JoinColumn(name = "donorID")
	@JsonIgnore
	private Donor donor;

	@ManyToOne()
	@JoinColumn(name = "campaignID")
	@JsonIgnore
	private Campaigns campaigns;

	public int getReceiptID() {
		return receiptID;
	}

	public void setReceiptID(int receiptID) {
		this.receiptID = receiptID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getDonationValue() {
		return donationValue;
	}

	public void setDonationValue(long donationValue) {
		this.donationValue = donationValue;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

}
