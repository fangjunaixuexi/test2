package com.fj.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserAction {
	@RequestMapping(value="toindex")
	public String toindex() {
		return "index";
	}

}
