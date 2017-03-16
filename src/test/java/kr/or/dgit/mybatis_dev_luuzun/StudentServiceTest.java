package kr.or.dgit.mybatis_dev_luuzun;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev_luuzun.dto.Course;
import kr.or.dgit.mybatis_dev_luuzun.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev_luuzun.dto.Student;
import kr.or.dgit.mybatis_dev_luuzun.dto.Tutor;
import kr.or.dgit.mybatis_dev_luuzun.services.CourseService;
import kr.or.dgit.mybatis_dev_luuzun.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //메서드 이름 순서대로 Test
public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforClass()");
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		studentService = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}
	
/*	@Test
	public void selectStudentByNoForResultMap() {
		Student std = new Student();
		std.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoForResultMap(std);
		Assert.assertNotNull(selectStudent);
	}
	
	@Test
	public void pTestselectStudentByAllForResultMap(){
		List<Student> lists = studentService.selectStudentByAllForResultMap();
		List<Student> empty = Collections.emptyList();
		Assert.assertNotEquals(lists, empty);	
	}
	*/
	//
	
//	@Test
//	public void selectStudentByNoForHashMap() {
//		Student std = new Student();
//		std.setStudId(1);
//		
//		Map<String, Object> selectStudent = studentService.selectStudentByNoForHashMap(std);
//		for(Entry<String, Object> e: selectStudent.entrySet()){
//			System.out.printf("<%s : %s> \n",e.getKey(), e.getValue());
//		}
//		Assert.assertNotNull(selectStudent);
//	}
//	
//	@Test
//	public void pTestselectStudentByAllForHashMap(){
//		List<Map<String, Object>> lists = studentService.selectStudentByAllForHashMap();
//		List<Map<String, Object>> empty = Collections.emptyList();
//		for(Map<String,Object> map : lists){
//			for(Entry<String, Object> e: map.entrySet()){
//				System.out.printf("<%s : %s> \n",e.getKey(), e.getValue());
//			}
//		}
//		Assert.assertNotEquals(empty, lists);	
//	}
	
/*	@Test
	public void selectStudentByNoWithAddress() {
		Student std = new Student();
		std.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoWithAddress(std);
		Assert.assertNotNull(selectStudent);
	}*/
	
/*	@Test
	public void TestSelectStudentByNoAssociationAddress() {
		Student std = new Student();
		std.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoAssociationAddress(std);
		Assert.assertNotNull(selectStudent);
	}*/
	
	/*@Test
	public void updateSetStudent() {
		Student student = new Student(10, "test", "@@@", new Date(), new PhoneNumber("555-5555-55"));
		int res = studentService.updateSetStudent(student);
		Assert.assertNotNull(res);
	}*/
}