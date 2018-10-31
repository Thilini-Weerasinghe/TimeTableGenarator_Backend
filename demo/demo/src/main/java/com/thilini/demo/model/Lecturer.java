package com.thilini.demo.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="lecturer")
public class Lecturer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="Lec_id")
	private Integer lectureId;
	
	@Column(name="l_name")
	private String lecturer_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="tel_no")
	private Integer telephone_no;
	
	@OneToMany(mappedBy="lecturer")
	@JsonIgnore
	private Iterable<Subject> subject = new ArrayList<>();
	
	public Lecturer() {
		
	}
	
	public Lecturer(Integer id, Integer lectureId, String lecturer_name, String email, Integer telephone_no) {
		super();
		this.id = id;
		this.lectureId = lectureId;
		this.lecturer_name = lecturer_name;
		this.email = email;
		this.telephone_no = telephone_no;
	}
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLectureId() {
		return lectureId;
	}

	public void setLectureId(Integer lectureId) {
		this.lectureId = lectureId;
	}

	public String getLecturer_name() {
		return lecturer_name;
	}

	public void setLecturer_name(String lecturer_name) {
		this.lecturer_name = lecturer_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelephone_no() {
		return telephone_no;
	}

	public void setTelephone_no(Integer telephone_no) {
		this.telephone_no = telephone_no;
	}

		
	  
	
}
