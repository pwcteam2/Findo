package com.findo.team2.findo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findo.team2.findo.entities.Campaigns;
import com.findo.team2.findo.repo.CampaignsRepo;

@Service
public class CampaignService {

	@Autowired
	CampaignsRepo campaignRepo;

	public List<Campaigns> findAllCampaigns() {
		// TODO Auto-generated method stub
		return campaignRepo.findAll();
	}

	public Boolean deleteCamapign(int campaignID) {
		// TODO Auto-generated method stub
		Optional<Campaigns> campaign = campaignRepo.findById(campaignID);
		if (campaign == null) {
			return false;
		} else {
			campaignRepo.delete(campaign.get());
			return true;
		}
	}

	public List<Campaigns> findByStatus(String status) {
		return campaignRepo.findByStatus(status);
	}

	public Campaigns updateCampaign(int campaignID, Campaigns campaign) {
		campaignRepo.findById(campaignID);
		campaign.setCampaignID(campaignID);
		return campaignRepo.save(campaign);
	}

}
