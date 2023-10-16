package skilltracker.fse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import skilltracker.fse.dto.LoginUser;
import skilltracker.fse.dto.Result;
import skilltracker.fse.entity.User;
import skilltracker.fse.service.LoginService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class LoginController {

	private LoginService loginService;

	@Autowired
	public void setSkillsService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = {
			"content-type=application/json" }, consumes = {
					MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Result fetchProfile(@RequestBody LoginUser user) {
		List<User> users = this.loginService.fetchUser(user);
		System.out.println("result" + users);
		return users.size() != 1 ? new Result(-1, "Please enter your credentials correctly.", "") : new Result(users.toArray());
	}

}
