package com.pwc.team2.entities;

import javax.persistence.Entity;

@Entity
public class CampaignBeneficieries {
	private 	int CBeneID;
	private 	int CampaignID;
	private 	int BeneficiaryID;
	private 	int DonationValue;
	public int getCBeneID() {
		return CBeneID;
	}
	public void setCBeneID(int cBeneID) {
		CBeneID = cBeneID;
	}
	public int getCampaignID() {
		return CampaignID;
	}
	public void setCampaignID(int campaignID) {
		CampaignID = campaignID;
	}
	public int getBeneficiaryID() {
		return BeneficiaryID;
	}
	public void setBeneficiaryID(int beneficiaryID) {
		BeneficiaryID = beneficiaryID;
	}
	public int getDonationValue() {
		return DonationValue;
	}
	public void setDonationValue(int donationValue) {
		DonationValue = donationValue;
	}
	

}
