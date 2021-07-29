package com.findo.team2.findo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.findo.team2.findo.entities.Donor;
import com.findo.team2.findo.repo.DonorRepo;

@Service
public class DonorService {

	@Autowired
	DonorRepo donorRepo;

	public List<Donor> findAll() {
		// TODO Auto-generated method stub
		return donorRepo.findAll();
	}

	public Donor registerDonor(@Valid Donor donor) {
		// TODO Auto-generated method stub
		return donorRepo.save(donor);
	}

	public Boolean delete(int donorID) {
		// TODO Auto-generated method stub
		Optional<Donor> donor = donorRepo.findById(donorID);
		if (donor == null) {
			return false;
		} else {
			donorRepo.delete(donor.get());
			return true;
		}
	}

	public Optional<Donor> findDonorByID(int donorID) {
		// TODO Auto-generated method stub
		Optional<Donor> donor = donorRepo.findById(donorID);
		return donor;
	}

	public Donor updateDonor(int donorID, Donor donor) {
		// TODO Auto-generated method stub
		donorRepo.findById(donorID);
		donor.setDonorID(donorID);
		return donorRepo.save(donor);
	}
}
