package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//@Transactional for to enable the write mode in DB , previously we are in "Read only mode" , also have to define the bean class in spring-servlet.xml file
	@Transactional
	public int saveUser(User user)
	{
		int id=(Integer)hibernateTemplate.save(user);
		return id;
		
	}

}
