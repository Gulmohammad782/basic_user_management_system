package com.gulmohammad.user.userManagementSystem.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gulmohammad.user.userManagementSystem.Entity.UserDetails1;



public interface UserRepository extends JpaRepository<UserDetails1, Integer> {

	public boolean existsByEmail(String email);

	public UserDetails1 findByEmail(String email);

}
