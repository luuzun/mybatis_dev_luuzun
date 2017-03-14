package kr.or.dgit.mybatis_dev_luuzun.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev_luuzun.dto.Student;

public interface StudentMapper {
	Student selectStudentByNoForResultMap(Student student);
	List<Student> selectStudentByAllForResultMap();
	
	Map<String, Object> selectStudentByNoForHashMap(Student student);
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	Student selectStudentByNoWithAddress(Student student);
	List<Student> selectStudentByAllWithAddress();
	
	Student selectStudentByNoAssociationAddress(Student student);
}