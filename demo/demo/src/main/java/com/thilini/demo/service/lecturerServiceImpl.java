package com.thilini.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thilini.demo.model.Lecturer;
import com.thilini.demo.repository.lectureRepository;
@Service
public class lecturerServiceImpl implements lecturerService {

	@Autowired
	private lectureRepository lectureRepository  ;
	
	@Override
	public Iterable<Lecturer> findAllLecturer() {
		// TODO Auto-generated method stub
		return lectureRepository.findAll();
		
	}
//
//	@Override
//	public String saveUser(Lecturer userData) {
//		// TODO Auto-generated method stub
//		lectureRepository.save(userData); 
//		return "data saved";
//	}  
//	

	@Override
	public Iterable<Lecturer> saveLecturer(Iterable<Lecturer> lecturer) {

	return	lectureRepository.saveAll(lecturer);
	
	}

	
//
//	@Override
//	public Iterable<lecturer> saveUser(Lecturer lecdata) {
//		// TODO Auto-generated method stub
//		return lectureRepository.saveAll();
//	}

	

}
