package com.VehicleBreakdown.Assistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VehicleBreakdown.Assistance.model.Mechanic;

@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Long>  {
	
	public List<Mechanic> findByMechanicLocation(String location);
	
	public void deleteByMechanicId(int mechanicId);

	public Mechanic findByMechanicId(long mechanicId);

	public Mechanic findByMechanicEmailId(String email);
}
