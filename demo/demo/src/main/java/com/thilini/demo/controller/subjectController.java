package com.thilini.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thilini.demo.model.Subject;
import com.thilini.demo.service.subjectService;

@RestController
public class subjectController {
	
	@Autowired
	private subjectService subjectService;
	
	@GetMapping("/subject")
	public Iterable<Subject> findAllSubject(){
		return subjectService.findAllSubject();
	}
	}
