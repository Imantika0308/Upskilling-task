package com.example.StudentDetailsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDetailsModel.Students;
import com.example.StudentDetailsRepository.StudentsRepository;

@Service
public class StudentsService {

	@Autowired
	StudentsRepository stRepo;
	public Students addStudents(Students student) {
		 
		return stRepo.save(student);
	}
	public List<Students> getStudents() {

		return (List<Students>) stRepo.findAll();
	}

}
