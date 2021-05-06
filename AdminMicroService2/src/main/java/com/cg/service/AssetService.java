package com.cg.service;

import java.util.List;

import com.cg.entity.Asset;

public interface AssetService {
	
    public Asset addAsset(Asset ast);
	
	public Asset updateAsset(Asset ast);
	
	public Asset removeAsset(Integer astId);
	
	
	List<Asset> getAllAsset();

	Asset viewAssetById(int id);
	
	
	
}
