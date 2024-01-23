package com.contact.contact_service.Entity;

public class Contact {
	private int cId;
	private String email;
	private String contactName;
	private int userId;
	public Contact(int cId, String email, String contactName, int userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	public Contact() {
		super();
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
