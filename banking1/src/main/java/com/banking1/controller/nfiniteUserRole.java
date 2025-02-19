package com.banking1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking1.entity.nfiniteUser;
import com.banking1.service.nfiniteUserInterface;

@RestController
@RequestMapping("/api/v1/nfiniteuser")
public class nfiniteUserRole {
	
	@Autowired
	private nfiniteUserInterface nfiniteService;
	
	@GetMapping
	public List<nfiniteUser> displayAllRecord() {
		return nfiniteService.getAllNfiniteUserService();
		
	}
	
	@PostMapping
	public String createRecord(@RequestBody nfiniteUser nfu) {
	return nfiniteService.createProfileService(nfu);
	}

}
