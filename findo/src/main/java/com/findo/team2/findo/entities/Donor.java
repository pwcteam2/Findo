package com.findo.team2.findo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "donor")
public class Donor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int donorID;
	private String name;
	private String address;
	@Column(name = "contactDetails")
	private String contactDetails;
	@Column(name = "keepAnonymous")
	private Boolean keepAnonymous;
	@Email(message = "Please enter a valid E-mail address")
	private String email;
	@Column(name = "loginPassword")
	private String loginPassword;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "donor")
	List<DonorInterest> donorInterest;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "donor")
	List<CampaignDonations> campaignDonations;

	public List<CampaignDonations> getCampaignDonations() {
		return campaignDonations;
	}

	public void setCampaignDonations(List<CampaignDonations> campaignDonations) {
		this.campaignDonations = campaignDonations;
	}

	public List<DonorInterest> getDonorInterest() {
		return donorInterest;
	}

	public void setDonorInterest(List<DonorInterest> donorInterest) {
		this.donorInterest = donorInterest;
	}

	public int getDonorID() {
		return donorID;
	}

	public void setDonorID(int donorID) {
		this.donorID = donorID;
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

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Boolean getKeepAnonymous() {
		return keepAnonymous;
	}

	public void setKeepAnonymous(Boolean keepAnonymous) {
		this.keepAnonymous = keepAnonymous;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

}
