package org.yangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangjie.dao.UserDao;
import org.yangjie.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void add(User user){
		userDao.save(user);
	}
	
	public void delete(User user){
		userDao.delete(user);
	}
	
	public User getByUserid(int userid) {
		return userDao.getByUserid(userid);
	}
	
	public User getByUsername(String username) {
		return userDao.getByUsername(username);
	}
	
}
