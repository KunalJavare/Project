package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ManagerDao;
import com.cg.entity.Manager;

@Service
public  class ManagerServicesImpl implements ManagerServices{

	@Autowired
	ManagerDao mngrdao;
	
	ManagerServicesImpl(){	
	}
	
	//Code for Raise Request to Admin
	@Override
	public List<Manager> raiseRequest(Manager m) {
		System.out.println("Raise Request");
		mngrdao.saveAndFlush(m);
		return mngrdao.findAll();
	}

    //Code for Find All Request
	@Override
	public List<Manager> checkStatus(Manager m) {
		System.out.println("Check Request");
		mngrdao.saveAndFlush(m);
		return mngrdao.findAll();
		
	}
	
}