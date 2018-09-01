package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "cl_fund_transfer")
@EntityListeners(AuditingEntityListener.class)
public class Register {

	private String firstName;
	private String lastName;
}
	
