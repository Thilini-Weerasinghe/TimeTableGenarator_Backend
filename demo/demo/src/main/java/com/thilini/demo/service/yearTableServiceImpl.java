package com.thilini.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thilini.demo.model.Years_table;
import com.thilini.demo.repository.years_tableRepository;

@Service
public class yearTableServiceImpl implements yearTableService {

	@Autowired
	private years_tableRepository years_tableRepository;
	
	
	@Override
	public Iterable<Years_table> findAll() {
		
		
		return years_tableRepository.findAll();
	}

}
