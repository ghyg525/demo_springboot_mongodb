package org.yangjie.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.yangjie.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void test(){
		User user = new User();
		user.setUserid(1);
		user.setUsername("1");
		List<String> typeList = new ArrayList<>();
		typeList.add("x");
		typeList.add("y");
		user.setTypeList(typeList);
		
		userService.add(user);
		
		user = userService.getByUserid(1);
		System.out.println(user.getUsername());
		user = userService.getByUsername("1");
		System.out.println(user.getTypeList());
		
		userService.delete(user);
		
	}
	
}
