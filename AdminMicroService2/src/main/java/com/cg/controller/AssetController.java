package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.entity.Asset;

import com.cg.service.AssetService;

@RestController
@RequestMapping("/admin")
public class AssetController {
	
	@Autowired
	RestTemplate rest;
	
	@Autowired
	private AssetService assetService;

	 Logger logger = LoggerFactory.getLogger(AssetController.class);

	 
	//Adding the Asset
	@PostMapping(value = "/addasset")
	public Asset addAsset(@Valid @RequestBody Asset ast){
		logger.info("Asset addAsset()");
		Asset assets = assetService.addAsset(ast);
		return assets;
	}	

	
	//Updating the Asset Details 
	@PutMapping(value = "/updateAsset")
	public Asset updateAsset(@Valid @RequestBody Asset ast) {
		logger.info("Asset updateAsset()");
		Asset assets = assetService.updateAsset(ast);
		return assets;

	}
      
	

	//Deleting the Asset using AssetId
	@DeleteMapping(value = "/removeAsset/{astId}")
	public Asset removeAsset(@PathVariable("astId")int astId) {

		logger.info("Customer removeCustomer()");
		return assetService.removeAsset(astId);

	}
	
	//Getting all Asset information
	@GetMapping("findAllAsset")
	public List<Asset> findallAssets(){
	    logger.info("listAllAsset AssetController");
		return assetService.getAllAsset();
	}
			
	
	//View All AssetRequests from manager
	@GetMapping(value = "/viewallrespondent")
	public ResponseEntity<String> viewAllRespondent() {
		logger.info("get all Respondent from admin controller");
		//String Respondent = rest.getForObject("http://localhost:1243/admin/viewallrespondent", String.class);
		String Respondent = rest.getForObject("http://localhost:1243/ast/viewallrequests", String.class);
		return ResponseEntity.ok(Respondent);
	}

}
