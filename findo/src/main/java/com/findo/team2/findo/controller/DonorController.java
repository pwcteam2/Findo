package com.findo.team2.findo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.findo.team2.findo.entities.Donor;
import com.findo.team2.findo.services.DonorService;

@RestController
public class DonorController {

	@Autowired
	DonorService donorService;
	

	@GetMapping("/listOfDonors")
	public List<Donor> getAll() {
		List<Donor> donors = donorService.findAll();
		return donors;
	}
	
	@PostMapping("/registerDonor")
	public Donor donor(@Valid @RequestBody Donor donor) {
		return donorService.registerDonor(donor);
	}
	
	@DeleteMapping("/deleteDonor/{donorID}")
	public Boolean delete(@PathVariable("donorID") int donorID) {
		return donorService.delete(donorID);

	}
	
	@GetMapping(value = "/listOfDonor/{donorID}")
	public Donor getDonor(@PathVariable("donorID") int donorID) {
		Optional<Donor> donor = donorService.findDonorByID(donorID);
		return donor.get();
	}
	
	@PutMapping("/updateDonor/{donorID}")
	public Donor update(@PathVariable("donorID") int donorID, @RequestBody Donor donor) {
		return donorService.updateDonor(donorID, donor);
	}

}
