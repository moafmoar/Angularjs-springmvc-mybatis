package com.hin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hin.entity.User;
import com.hin.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/userlist.json")
    public @ResponseBody List<User> getUserList() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/addUser/{userName}", method = RequestMethod.POST)
    public @ResponseBody void addUser(@PathVariable("userName") String userName) {
    	userService.addUser(userName);
    }

    @RequestMapping(value = "/removeUser/{userName}", method = RequestMethod.DELETE)
    public @ResponseBody void removeUser(@PathVariable("userName") String userName) {
    	userService.deleteUser(userName);
    }

    @RequestMapping(value = "/removeAllUsers", method = RequestMethod.DELETE)
    public @ResponseBody void removeAllUsers() {
    	userService.deleteAll();
    }

    @RequestMapping(value = "/updateUser/{userId}",method = RequestMethod.PUT)
    public @ResponseBody void updateUser(@PathVariable("userId") int userId){
        userService.updateUser(userId);
    }

    @RequestMapping("/layout")
    public String getUserPartialPage() {
        return "users/layout";
    }
	
}
