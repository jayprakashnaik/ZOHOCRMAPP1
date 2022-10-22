package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepository;
import com.zohocrm.services.LeadService;

@RequestMapping("/api/leads")
@RestController
public class LeadRestController {

	@Autowired
	private LeadService leadService;

	@GetMapping()
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadService.findAllLeads();
		return leads;
	}
	
	@PostMapping
	public void saveOneLead(@RequestBody Lead lead) {
		leadService.saveLead(lead);
	}

}
