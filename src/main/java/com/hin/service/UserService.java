package com.hin.service;

import java.util.List;

import com.hin.entity.User;

public interface UserService {

	public User login(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();

    public void addUser(String userName);

    public void deleteUser(String userName);

    public void deleteAll();

    public void updateUser(int userId);
}
