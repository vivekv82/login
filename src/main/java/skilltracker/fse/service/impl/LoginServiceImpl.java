package skilltracker.fse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skilltracker.fse.dao.LoginRepository;
import skilltracker.fse.dto.LoginUser;
import skilltracker.fse.entity.User;
import skilltracker.fse.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public List<User> fetchUser(LoginUser loginUser) {
		System.out.println("Calling fetchProfile");
		return this.loginRepository.fetchUser(loginUser.getUserid().trim(), loginUser.getPassword().trim());

	}

}
