package com.thilini.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thilini.demo.model.Day_period;
import com.thilini.demo.repository.day_periodRepository;

@Service
public class day_periodServiceImpl implements day_periodService {

	@Autowired
	private day_periodRepository day_periodRepository;
	
	@Override
	public Iterable<Day_period> findAll() {
		
		return day_periodRepository.findAll();
	}

}
