package com.findo.team2.findo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "themes")
public class Themes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int themeID;
	private String campaignName;
	private String keywords;

	@OneToMany(targetEntity = DonorInterest.class, cascade = CascadeType.MERGE, mappedBy = "donor")
	List<DonorInterest> donorInterest;

//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "themes")
//	List<CampaignThemes> campaignThemes;

	public int getThemeID() {
		return themeID;
	}

	public void setThemeID(int themeID) {
		this.themeID = themeID;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

}
