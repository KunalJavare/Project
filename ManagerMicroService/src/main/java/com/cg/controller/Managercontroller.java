package com.cg.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.ManagerDao;
import com.cg.entity.Manager;
import com.cg.services.ManagerServices;

import io.swagger.annotations.Api;


@Api
@RestController()
@RequestMapping("/ast")

public class Managercontroller {
	
	@Autowired
	ManagerServices manager;
	@Autowired
	ManagerDao m;
	
	
	//Manager Raises request for asset
	@PostMapping("/raiserequest")
	public List<Manager> raiseRequest(@RequestBody Manager request){
		return manager.raiseRequest(request);	
		
	}
	
	//View all Requests
	@GetMapping("/viewallrequests")
	public List<Manager> checkStatus(){
		return m.findAll();
	}
	
	
}