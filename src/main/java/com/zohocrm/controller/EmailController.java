package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utilities.EmailService;
// to intercat with both LeadClass and Contact class we created email controller on different module.
@Controller
public class EmailController {
	@Autowired
	private EmailService emailservice;

	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("subject") String sub,
			@RequestParam("body") String body) {
		// As we received 3 parameters individually, hence take it individually
		emailservice.sendEmail(to, sub, body);
		return "compose_email";
	}
}
