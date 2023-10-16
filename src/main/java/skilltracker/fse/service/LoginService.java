package skilltracker.fse.service;

import java.util.List;

import skilltracker.fse.dto.LoginUser;
import skilltracker.fse.entity.User;


public interface LoginService {

	
	public List<User> fetchUser(LoginUser loginUser);
	
}
