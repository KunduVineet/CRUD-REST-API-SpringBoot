package in.vk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vk.beans.Student;
import in.vk.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDAO studentDAO;

	@Override
	public Student addStudent(Student std) {
		Student student = studentDAO.save(std);
		return student;
	}

	public List<Student> getAllStudents() {
		List<Student> students_list = studentDAO.findAll();
		return students_list;
	}

}
