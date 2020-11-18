package com.application.stack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.stack.entity.Stack;
import com.application.stack.entity.StackDetails;
import com.application.stack.service.StackService;

@Controller
@RequestMapping("/stack")
public class StackController {
	
	@Autowired StackService stackService;
	
	@GetMapping("/list")
	public String getStackDetails(Model model){
		
		List<Stack> stack = stackService.getAllStackDetails();
		
		model.addAttribute("stackList", stack);
		
		return "stack-list";
	}
	
	@PostMapping("/saveStack")
	public String saveCustomer(@ModelAttribute("stackDetails") StackDetails stackDetails) {
		
		Stack stack = stackService.getStackById(stackDetails.getId());
		
		stack.setStatus("Engaged");
		
		stack.setStackDetails(stackDetails);
		
		stackService.saveStack(stack);
		
		return "redirect:/stack/list";
	}
	
	@GetMapping("/editStackDetails")
	public String updateStackDetails(@RequestParam("stackId") int id, Model model) {
		
		Stack stack = stackService.getStackById(id);
		
		model.addAttribute("stack", stack);
		
		model.addAttribute("stackDetails", stack.getStackDetails());
		
		return "stack-update-form";
	}
	
	@GetMapping("/viewStackDetails")
	public String updateCustomer(@RequestParam("stackId") int id, Model model) {
		
		Stack stack = stackService.getStackById(id);
		
		model.addAttribute("stackName", stack.getStackName());
		
		model.addAttribute("stackDetails", stack.getStackDetails());
		
		return "stack-view-form";
	}
	
	@GetMapping("/releaseStack")
	public String deleteStack(@RequestParam("stackId") int id) {
		
		Stack stack = stackService.getStackById(id);
		
		stack.setStatus("Available");
		
		stack.getStackDetails().setBebranch(null);
		
		stack.getStackDetails().setFeBranch(null);
		
		stack.getStackDetails().setPurpose(null);
		
		stack.getStackDetails().setUserName(null);
		
		stackService.saveStack(stack);
		
		return "redirect:/stack/list";
	}
	
}
