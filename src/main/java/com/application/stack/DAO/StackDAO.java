package com.application.stack.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.application.stack.entity.Stack;

public interface StackDAO extends JpaRepository<Stack, Integer>{
	

}
