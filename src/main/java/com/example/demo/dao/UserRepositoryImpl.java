package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.User;

@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired HibernateTemplate template;
	@Override
	public List<User> getAllUsers() {
		return template.loadAll(User.class);
		
	}

}
