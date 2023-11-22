package com.example.StudentDetailsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDetailsModel.Students;
import com.example.StudentDetailsService.StudentsService;

@RestController
@RequestMapping("/studentDetails")
public class StudentsController {

	@Autowired
	private StudentsService stService;
	
	@PostMapping("/add")
	public Students addStudents(@RequestBody Students student)
	{	
		return stService.addStudents(student);
	}
	@GetMapping("/get")
	public List<Students> getAllStudents()  
	{
		return stService.getStudents();
	}
	
	
}
