package in.vk.service;

import java.util.List;

import in.vk.beans.Student;

public interface StudentService {
	public Student addStudent(Student std);
	
	public List<Student> getAllStudents();
	
	public Student getstudent(int id);
	
	public Student updateStudent(Student std);

}
