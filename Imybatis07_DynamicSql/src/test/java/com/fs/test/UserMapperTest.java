package com.fs.test;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.fs.mapper.UserMapper;
import com.fs.po.User;
import com.fs.util.DBUtil;

import java.sql.Date;

public class UserMapperTest {
	@Test
	public void insertTest() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);

		User user = new User();
		user.setName("Í£Í£");
		user.setHeight(1.75f);
		//insert into user(name,height)values(#{name},#{height})
		mapper.insertUser(user);
		
		user = new User();
		user.setName("¸ç¸ç");
		user.setSex("ÄÐ");
		user.setBirthday(new Date(1980, 3, 20));
		//insert into user(name,sex,birthday)values(#{name},#{sex},#{birthday})
		mapper.insertUser(user);
		
		session.commit();
		session.close();
	}
	
	@Test
	public void deleteByMultipleFieldsTest() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setName("¸ç¸ç");
		user.setSex("ÄÐ");
		int r = mapper.deleteByMultipleFields(user);
		System.out.println(r);
		session.commit();
		session.close();
	}
	@Test
	public void selectByByMultipleFields1Test() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
//		user.setId(111);
		user.setName("¸ç¸ç");
		List<User> list = mapper.selectByByMultipleFields1(user);
		for (User user1 : list) {
			System.out.println(user1);
		}
		session.commit();
		session.close();
	}
	@Test
	public void selectByByMultipleFields2Test() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
//		user.setId(111);
		user.setName("¸ç¸ç");
		List<User> list = mapper.selectByByMultipleFields2(user);
		for (User user1 : list) {
			System.out.println(user1);
		}
		session.commit();
		session.close();
	}
	
	@Test
	public void selectUserInTest() {
		SqlSession session = DBUtil.getSqlSessionFactory().openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.selectIn(new int[]{11,13});
		session.commit();
		session.close();
		for (User user : list) {
			System.out.println(user);
		}
	}
}













