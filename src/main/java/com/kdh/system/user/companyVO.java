package com.kdh.system.user;

public class companyVO {
	private String name;
	private String id;
	private String condition;
	private String business; 
	private String address;
	private String represent;
	private String chargeperson;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getChargeperson() {
		return chargeperson;
	}
	public void setChargeperson(String chargeperson) {
		this.chargeperson = chargeperson;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getRepresent() {
		return represent;
	}
	public void setRepresent(String represent) {
		this.represent = represent;
	}	
}
