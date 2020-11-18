package com.application.stack.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="stack")
public class Stack {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="stack_name")
	private String stackName;
	
	@Column(name="status")
	private String status;
	
	@JsonBackReference
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="stack_detail_id")
	private StackDetails stackDetails;
	
	public Stack() {
		
	}

	public Stack(String stackName, String status, StackDetails stackDetails) {
		super();
		this.stackName = stackName;
		this.status = status;
		this.stackDetails = stackDetails;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStackName() {
		return stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public StackDetails getStackDetails() {
		return stackDetails;
	}

	public void setStackDetails(StackDetails stackDetails) {
		this.stackDetails = stackDetails;
	}

	@Override
	public String toString() {
		return "Stack [id=" + id + ", stackName=" + stackName + ", status=" + status + ", stackDetails=" + stackDetails
				+ "]";
	}
	
	

}
