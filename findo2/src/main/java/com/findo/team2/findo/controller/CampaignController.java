package com.findo.team2.findo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findo.team2.findo.entities.Campaigns;
import com.findo.team2.findo.services.CampaignService;

@RestController
@RequestMapping("/rest/h")
public class CampaignController {

	@Autowired
	CampaignService campaignService;

	@GetMapping("/allCampaigns")
	public List<Campaigns> getAll() {
		List<Campaigns> campaigns = campaignService.findAllCampaigns();
		return campaigns;
	}

	@DeleteMapping("/delCampaigns/{campaignID}")
	public Boolean delete(@PathVariable("campaignID") int campaignID) {
		return campaignService.deleteCamapign(campaignID);
	}

	@GetMapping(value = "/activeCampaigns/{status}")
	public List<Campaigns> getDonor(@PathVariable("status") String status) {
		List<Campaigns> campaigns = campaignService.findByStatus(status);
		return campaigns;
	}

	@PutMapping("/updateCampaign/{campaignID}")
	public Campaigns update(@PathVariable("campaignID") int campaignID, @RequestBody Campaigns campaign) {
		return campaignService.updateCampaign(campaignID, campaign);
	}

}
