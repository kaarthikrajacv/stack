package com.application.stack.service;

import java.util.List;

import com.application.stack.entity.Stack;
import com.application.stack.entity.StackDetails;

public interface StackService {
	
	public List<Stack> getAllStackDetails();

	public void saveStackDetails(StackDetails stackDetails);

	public Stack getStackById(int id);
	
	public void saveStack(Stack stack);

}
