package com.banking1.service;

import java.util.List;


import com.banking1.entity.nfiniteUser;

public interface nfiniteUserInterface {

	List<nfiniteUser> getAllNfiniteUserService();

	String createProfileService(nfiniteUser nfu);
	

}
