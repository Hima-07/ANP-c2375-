package org.practicaltest.question2.service;

import org.practicaltest.question2.DAO.UserDAO;
import org.practicaltest.question2.model.User;
import org.practicaltest.question2.exception.PasswordFormateException;

public class UserService {
	UserDAO userDAO=new UserDAO();

	public String setUser(User user) throws PasswordFormateException {
		if(user.getPassword().length()<6) {
			throw new PasswordFormateException("Length of password is less than 6 Character.");
		}
		return userDAO.setUser(user);
	}

	public User[] displayUserDetails() {
		return userDAO.displayUserDetails();
	}


}
