package kr.or.dgit.mybatis_dev_luuzun;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev_luuzun.dto.Student;
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
	
	@Test
	public void selectStudentByNoForResultMap() {
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.selectStudentByNoForResultMap(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void pTestselectStudentByAllForResultMap(){
		List<Student> lists = studentService.selectStudentByAllForResultMap();
		List<Student> empty = Collections.emptyList();
		Assert.assertNotEquals(lists, empty);	
	}
}