package com.gulmohammad.user.userManagementSystem.Service;

import com.gulmohammad.user.userManagementSystem.Entity.UserDetails1;

public interface UserService {

	public UserDetails1 createUser(UserDetails1 user);

	public boolean checkEmail(String email);

}