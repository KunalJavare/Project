package com.cg.exception;

public class AssetNotFoundException extends RuntimeException {
	
String msg;
	
	public AssetNotFoundException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
		
	}
	

}
