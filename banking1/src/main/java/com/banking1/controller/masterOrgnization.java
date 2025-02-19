package com.banking1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking1.entity.Employee;
import com.banking1.entity.Org;
import com.banking1.service.BankingServiceInterface;
import com.banking1.service.orgService;
import com.banking1.service.orgServiceInterface;

@RestController
@RequestMapping("api/v1/masterorg")


public class masterOrgnization {
	

	
	@Autowired
	private orgServiceInterface OService;


	@PostMapping
	public String createRecord(@RequestBody Org org) {
		OService.createorg(org);
		return "success";
	}
	
	@GetMapping
	public List<Org> displayAllRecord() {
		return OService.getAllorgdetails(); 
	}
}
