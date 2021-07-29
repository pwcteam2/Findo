package com.findo.team2.findo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findo.team2.findo.entities.Campaigns;

public interface CampaignsRepo extends JpaRepository<Campaigns, Integer> {

	List<Campaigns> findByStatus(String status);

}
