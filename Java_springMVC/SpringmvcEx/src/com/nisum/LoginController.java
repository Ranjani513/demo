package com.nisum;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	String message;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String login(Model model, @Validated User user) {
		System.out.println("user:::"+user.toString());
		if ((user.getname()).equals("Ranjani") && user.getpassword().equals("pass")) {
			String message = "Hello" + "\t" + user.getname();
			model.addAttribute("message", message);
			return "welcome";
		} else {
			String message = "please enter the correct password";
			model.addAttribute("message", message);
			return "errorpage";
		}

	}
}                    