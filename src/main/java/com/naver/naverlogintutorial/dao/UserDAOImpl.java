package com.naver.naverlogintutorial.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.naver.naverlogintutorial.model.SnsUser;
import com.naver.naverlogintutorial.model.User;
import com.naver.naverlogintutorial.oauth.model.NaverUser;

public class UserDAOImpl implements UserDAO{

	@Autowired
	private BaseDAO baseDAO;
	
	private static final String NAMESPACE = "user.";
	
	
	@Override
	public User getUserById(int id) {
		return (User)baseDAO.selectOne(NAMESPACE + "selectUserById", id);
	}

	@Override
	public User getUserByUserName(String userName) {
		return (User)baseDAO.selectOne(NAMESPACE + "selectUserByUserName", userName);
	}
	
	@Override
	public User getUserBySnsId(String snsId) {
		/* TODO: implement */
		return null;
	}
	
	@Override
	public User insertUser(User user){
		baseDAO.insert(NAMESPACE + "insertNormalUser", user);
		return getUserByUserName(user.getUserName());
	}

	@Override
	public SnsUser insertUser(NaverUser naverUser, String username) {
		
		/* TODO: implement */
		return null;
	}

}
