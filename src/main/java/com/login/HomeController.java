package com.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.login.model.GetGeoDetails;
import com.login.model.Login;
import com.login.model.User;
import com.login.service.LoginService;

@Controller
public class HomeController {

	@Autowired
	LoginService service;

	@RequestMapping("/")
	public String home() {

		return "home";
	}

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		if (username.equalsIgnoreCase("admin")) {
			mv.addObject("username", username);
			mv.addObject("password", password);
			mv.setViewName("display");
		} else {
			mv.addObject("error", "Invalid credentials");
			mv.setViewName("home");

		}

		return mv;
	}

	@RequestMapping("/list")
	public ModelAndView name() {
		List<Login> name = service.name();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listofdata", name);
		modelAndView.setViewName("list");
		return modelAndView;
	}

	@RequestMapping("/call")
	public ModelAndView callAPI() {
		List<GetGeoDetails> name = service.callAPI();
		ModelAndView andView = new ModelAndView();
		andView.addObject("listofdata", name);
		andView.setViewName("geo");
		return andView;
	}

}
