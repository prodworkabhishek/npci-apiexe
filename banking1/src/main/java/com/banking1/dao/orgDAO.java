package com.banking1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking1.entity.Employee;
import com.banking1.entity.Org;

@Repository
public interface orgDAO extends JpaRepository<Org, String>{

}
