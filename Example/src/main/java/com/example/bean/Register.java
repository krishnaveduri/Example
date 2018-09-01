package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "user_register_details")
@EntityListeners(AuditingEntityListener.class)
public class Register {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "#RefId")
	private long userRefId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email_id")
	private String eamilId;
	@Column(name="password")
	private String password;
	public long getUserRefId() {
		return userRefId;
	}
	public void setUserRefId(long userRefId) {
		this.userRefId = userRefId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEamilId() {
		return eamilId;
	}
	public void setEamilId(String eamilId) {
		this.eamilId = eamilId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
	
