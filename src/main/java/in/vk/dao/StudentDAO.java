package in.vk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.vk.beans.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{
	

}
