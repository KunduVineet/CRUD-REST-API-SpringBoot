package in.vk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.vk.beans.Student;
import in.vk.service.StudentService;

@RestController
public class MyController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
//	public Student AddStudent(@RequestParam int id, @RequestParam String name, @RequestParam String gender, @RequestParam String city) {
	public Student AddStudent(@RequestBody Student std) {

//		Student std = new Student();
//		std.setId(id);
//		std.setName(name);
//		std.setGender(gender);
//		std.setCity(city);
		
		Student student =  studentService.addStudent(std);
		 return student;
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		List<Student> students_list = studentService.getAllStudents();
		
		return students_list;
	}

}
