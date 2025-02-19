package com.banking1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking1.entity.Org;
import com.banking1.entity.nfiniteUser;

public interface nfiniteuserDAO extends  JpaRepository<nfiniteUser, String>{

}