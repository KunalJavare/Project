package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Manager")
public class Manager {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Min(1)
	@Max(100)
	private int emp_id;
	
	@NotEmpty(message = "Please enter a asset type")
	@Size(min = 1, max = 20, message = "Asset Type must be between 1 and 20 characters")
	private String asset_type;
	
	@NotEmpty(message = "Please enter a location name")
	@Size(min = 1, max = 20, message = "Location must be between 1 and 100 characters")
	private String location;
	
	
	public Manager() {
	
	}

	public Manager(int emp_id, String asset_type, String location) {
		super();
		this.emp_id = emp_id;
		this.asset_type = asset_type;
		this.location = location;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getAsset_type() {
		return asset_type;
	}

	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Manager [emp_id=" + emp_id + ", asset_type=" + asset_type + ", location=" + location + "]";
	}

}




/*public class Manager {
	
	@Id
	@Column(name = "req_id")
	
	private int request_id;
	
	@Column(name = "ass_name")
	private String asset_name;
	
	@Column(name ="req_status")
	private String req_status;
	
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public String getAsset_name() {
		return asset_name;
	}
	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}
	
		
	public String getReq_status() {
		return req_status;
	}
	public void setReq_status(String req_status) {
		this.req_status = req_status;
	}
	
	@Override
	public String toString() {
		return "Manager [request_id=" + request_id + ", asset_name=" + asset_name + ", req_status=" + req_status + "]";
	}
	
}*/