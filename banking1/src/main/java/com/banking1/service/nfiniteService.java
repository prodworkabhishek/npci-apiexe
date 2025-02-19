package com.banking1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking1.dao.nfiniteuserDAO;
import com.banking1.entity.nfiniteUser;
@Service

public class nfiniteService implements nfiniteUserInterface {

	@Autowired
	private nfiniteuserDAO nDAO;
	
	@Override
	public List<nfiniteUser> getAllNfiniteUserService() {
		// TODO Auto-generated method stub
		return nDAO.findAll();
	}

	@Override
	public String createProfileService(nfiniteUser nfu) {
		// TODO Auto-generated method stub
		nDAO.save(nfu);
		return "s";
	}


}
