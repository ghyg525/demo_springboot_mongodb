package org.yangjie.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.yangjie.entity.User;

@Repository // <实体类型, 主键类型>
public interface UserDao extends MongoRepository<User, Integer>{
	
	// 通过方法名默认匹配
	public User getByUserid(int userid);
	
	@Query("{'username':'1'}") // 通过注解查询, 参数为json
	public User getByUsername(String username);
	
}
