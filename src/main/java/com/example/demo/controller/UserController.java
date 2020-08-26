package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.UserRepository;
import com.example.dto.User;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired UserRepository rep;
	
	@GetMapping
	@ResponseBody
	public List<User> getUsersData() {
		return rep.getAllUsers();//all users from db as json;
	}
}
