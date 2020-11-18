package com.application.stack.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="stack_detail")
public class StackDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="stack_user_name")
	private String userName;
	
	@Column(name="purpose")
	private String purpose;
	
	@Column(name="fe_branch")
	private String feBranch;
	
	@Column(name="be_branch")
	private String bebranch;
	
//	@OneToOne(mappedBy="stackDetails", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//	@JsonManagedReference
//	private Stack stack;
	
	public StackDetails() {
		
	}

	public StackDetails(String userName, String purpose, String feBranch, String bebranch) {
		super();
		this.userName = userName;
		this.purpose = purpose;
		this.feBranch = feBranch;
		this.bebranch = bebranch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getFeBranch() {
		return feBranch;
	}

	public void setFeBranch(String feBranch) {
		this.feBranch = feBranch;
	}

	public String getBebranch() {
		return bebranch;
	}

	public void setBebranch(String bebranch) {
		this.bebranch = bebranch;
	}
	
	

//	public Stack getStack() {
//		return stack;
//	}
//
//	public void setStack(Stack stack) {
//		this.stack = stack;
//	}

	@Override
	public String toString() {
		return "StackDetails [id=" + id + ", userName=" + userName + ", purpose=" + purpose + ", feBranch=" + feBranch
				+ ", bebranch=" + bebranch + "]";
	}

	
}
