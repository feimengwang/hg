package cn.true123.hg.controller;

import cn.true123.hg.dto.user.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping("/main")
	public String echo(){
		return "main";

	}

	@RequestMapping("/goLogin.do")
	public String login() {
		return "user/login";
	}

	@RequestMapping(value = "/login.do")
	public String login(UserDto userDto) {

		return "user/home";
	}
}
