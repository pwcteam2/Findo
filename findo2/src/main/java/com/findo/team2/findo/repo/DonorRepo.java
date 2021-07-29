package com.findo.team2.findo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.findo.team2.findo.entities.Donor;

@Repository
public interface DonorRepo extends JpaRepository<Donor, Integer> {

}
