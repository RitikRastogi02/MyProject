package com.nagarro.prog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.prog.entity.Library;
import com.nagarro.prog.service.LibService;

import antlr.collections.List;

@Controller
public class LibController {
	
	@Autowired
	private LibService service;
	
	@GetMapping("/index")
	public String home(Model m) {
		java.util.List<Library> lib=service.getAllLib();
		m.addAttribute("lib",lib);
		return "index";
	}
	
	@GetMapping("/addlib")
	public String addLibForm() {
		return "add_lib";
	}
	
	@PostMapping("/register")
	public String LibRegister(@ModelAttribute Library l, HttpSession session) {
		
		System.out.println(l);

		service.addLib(l);
		session.setAttribute("msg", "Book Added successfully");
		
		return "redirect:/index";
	}
	
	@GetMapping("/edit/{code}")
	public String edit(@PathVariable int code, Model m) {
		
		Library l=service.getLibById(code);
		
		m.addAttribute("lib",l);
		
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateLib(@ModelAttribute Library l,HttpSession session) {
		service.addLib(l);
		session.setAttribute("msg", "Book Updated Successfully");
		return "redirect:/index";
	}
	
	@GetMapping("/delete/{code}")
	public String deleteLib(@PathVariable int code, HttpSession session) {
		service.deleteLib(code);
		session.setAttribute("msg", "Book data deleted Successfully");
		return "redirect:/index";
	}
}
