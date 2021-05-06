package com.cg.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Manager;


public interface ManagerServices {

	public List<Manager> raiseRequest(Manager m);
	public List<Manager> checkStatus(Manager m);
}