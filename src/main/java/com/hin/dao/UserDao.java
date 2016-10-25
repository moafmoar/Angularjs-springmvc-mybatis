package com.hin.dao;

import java.util.List;

import com.hin.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

	public User login(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();

    public void addUser(String userName);

    public void deleteUser(String userName);

    public void deleteAll();

    public void updateUser(int userId);
}
