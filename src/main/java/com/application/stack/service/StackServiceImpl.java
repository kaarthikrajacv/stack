package com.application.stack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.stack.DAO.StackDAO;
import com.application.stack.DAO.StackDetailsDAO;
import com.application.stack.entity.Stack;
import com.application.stack.entity.StackDetails;

@Service
public class StackServiceImpl implements StackService {
	
	@Autowired StackDAO stackDAO;
	@Autowired StackDetailsDAO stackDetailsDAO;

	@Override
	@Transactional
	public List<Stack> getAllStackDetails() {
		
		return stackDAO.findAll();
		
	}

	@Override
	@Transactional
	public void saveStackDetails(StackDetails stackDetails) {
		
		stackDetailsDAO.save(stackDetails);
		
	}

	@Override
	@Transactional
	public Stack getStackById(int id) {
		
		return stackDAO.findById(id).get();
	}

	@Override
	public void saveStack(Stack stack) {
		
		stackDAO.save(stack);
		
	}

}
