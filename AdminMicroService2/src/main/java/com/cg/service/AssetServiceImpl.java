package com.cg.service;


import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.AssetDao;
import com.cg.entity.Asset;
import com.cg.entity.Asset;
import com.cg.exception.AssetNotFoundException;

import antlr.collections.AST;

import com.cg.exception.AssetNotFoundException;

@Service
@Transactional
public class AssetServiceImpl implements AssetService{
	
	
  @Autowired(required = true)
  private AssetDao assDao;


	Logger logger = LoggerFactory.getLogger(AssetServiceImpl.class);
	
	
	//Code for add asset
	@Override
	public Asset addAsset(Asset ast) {
		
		logger.info("Asset addAsset()");
		if(ast == null)
			throw new AssetNotFoundException("No Asset Found");
		logger.info("astdao... astdao" );
		System.out.println("astdao..." + assDao);
		assDao.save(ast);
		return ast;
	}

	//Code for Update Asset
	@Override
	public Asset updateAsset(Asset ast) {
		logger.info("Asset updateAsset()");
		if(ast == null)
			throw new AssetNotFoundException("No Asset Found");
		else {
			assDao.save(ast);
			return ast;
		}
	}

	//Code for remove asset
	@Override
	public Asset removeAsset(Integer astId) {
		logger.info("Asset removeAsset()");
		Optional<Asset> ast = assDao.findById(astId);
		if(!ast.isPresent())
			throw new AssetNotFoundException("No Asset Found");
		else {
			assDao.deleteById(astId);
			return ast.get();
		}
	}

	//Code for getting all Asset
	@Override
	public List<Asset> getAllAsset() {
		return assDao.findAll();
	}

	//Code for View Asset by id
	@Override
	public Asset viewAssetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
