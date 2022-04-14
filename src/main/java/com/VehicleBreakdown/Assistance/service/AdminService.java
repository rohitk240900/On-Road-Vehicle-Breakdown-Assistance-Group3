package com.VehicleBreakdown.Assistance.service;

import java.util.List;
import java.util.Optional;

import com.VehicleBreakdown.Assistance.model.Admin;
import com.VehicleBreakdown.Assistance.model.User;


public interface AdminService {
	List<User> getAllUsers();
	Admin updateAdmin(Admin admin);
	Optional<Admin> getAdminByUsername(String username);
}