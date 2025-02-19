package com.banking1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking1.dao.orgDAO;
import com.banking1.entity.Employee;
import com.banking1.entity.Org;

@Service
public class orgService implements orgServiceInterface {
   @Autowired
 private   orgDAO dao;
	@Override
	public void createorg(Org org) {
		// TODO Auto-generated method stub
		
		dao.save(org);
		
		
	}
	@Override
	public List<Org> getAllorgdetails() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	



}
