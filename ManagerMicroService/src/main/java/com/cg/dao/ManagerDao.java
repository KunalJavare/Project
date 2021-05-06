package com.cg.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Manager;

@Repository("mngrDao")
public interface ManagerDao extends JpaRepository<Manager, Integer> {
	
}