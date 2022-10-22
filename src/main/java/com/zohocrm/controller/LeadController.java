package com.zohocrm.controller;

import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Lead;
import com.zohocrm.services.LeadService;
import com.zohocrm.utilities.EmailService;


@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewLeadPage")
	public String viewLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")  												//Create
	public String saveOneLead(@ModelAttribute Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_information";
		
	}
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	@RequestMapping("/listAll")  												//Retrieve List
	public String  getAllLeads(ModelMap model) {
		List<Lead> leads=leadService.findAllLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	@RequestMapping("/findLeadById") 											// Retrieve lead
	public String getOneLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead =leadService.findOneLead(id);
		model.addAttribute("lead",lead);
		return "lead_information";
		
	}

}
