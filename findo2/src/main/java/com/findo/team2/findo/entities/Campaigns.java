package com.findo.team2.findo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "campaigns")
public class Campaigns {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int campaignID;
	private String name;
	private String imageUrl;
	private String message;
	private long targetDonation;
	private Date startDate;
	private Date endDate;
	private String status;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "campaigns")
	List<CampaignDonations> campaignDonations;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "campaigns")
	List<CampaignBeneficiaries> campaignD;

	public List<CampaignBeneficiaries> getCampaignD() {
		return campaignD;
	}

	public void setCampaignD(List<CampaignBeneficiaries> campaignD) {
		this.campaignD = campaignD;
	}

	public List<CampaignDonations> getCampaignDonations() {
		return campaignDonations;
	}

	public void setCampaignDonations(List<CampaignDonations> campaignDonations) {
		this.campaignDonations = campaignDonations;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private String createdBy;

	public int getCampaignID() {
		return campaignID;
	}

	public void setCampaignID(int campaignID) {
		this.campaignID = campaignID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTargetDonation() {
		return targetDonation;
	}

	public void setTargetDonation(long targetDonation) {
		this.targetDonation = targetDonation;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Campaigns [campaignID=" + campaignID + ", name=" + name + ", imageUrl=" + imageUrl + ", message="
				+ message + ", targetDonation=" + targetDonation + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", status=" + status + ", createdBy=" + createdBy + "]";
	}

}
