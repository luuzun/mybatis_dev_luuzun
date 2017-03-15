package kr.or.dgit.mybatis_dev_luuzun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev_luuzun.dto.Course;
import kr.or.dgit.mybatis_dev_luuzun.services.CourseService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //메서드 이름 순서대로 Test
public class CourseServiceTest {
	private static CourseService courseService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforClass()");
		courseService = new CourseService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		courseService = null;
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}
	
//	 @Test
//     public void testSearchCourse() {
//        Map<String, Object> param = new HashMap<>();
//        param.put("tutorId",1);
//        param.put("courseName", "%java%");
//        param.put("startDate", "2013-01-01");
//        param.put("endDate", "2013-05-01");
//        List<Course> searchCourse = courseService.searchCourse(param);
//        Assert.assertNotNull(searchCourse);
//     }
	 
/*	 @Test
     public void testSearchWhereCourses() {
        Map<String, Object> param = new HashMap<>();
        param.put("tutorId",1);
        param.put("courseName", "%java%");
        param.put("startDate", "2013-01-01");
        param.put("endDate", "2013-05-01");
        List<Course> searchCourse = courseService.searchCourse(param);
        Assert.assertNotNull(searchCourse);
     }*/
	
/*	 @Test
     public void testSearchWhereCourses() {
        Map<String, Object> param = new HashMap<>();
        param.put("tutorId",1);
        param.put("courseName", "%java%");
        param.put("startDate", "2013-01-01");
        param.put("endDate", "2013-05-01");
        List<Course> searchCourse = courseService.searchCourse(param);
        Assert.assertNotNull(searchCourse);
     }*/
	
	 /*@Test
     public void testsearchTrimCourses() {
        Map<String, Object> param = new HashMap<>();
        param.put("tutorId",1);
        param.put("courseName", "%java%");
        param.put("startDate", "2013-01-01");
        param.put("endDate", "2013-05-01");
        List<Course> searchCourse = courseService.searchTrimCourses(param);
        Assert.assertNotNull(searchCourse);
     }*/
	 
	 @Test
     public void searchForeachCoursesByTutors() {
		List<Integer> tutorIds = new ArrayList<>();
		tutorIds.add(1);
		//tutorIds.add(2);
		
        Map<String, Object> map = new HashMap<>();
        map.put("tutorIds",tutorIds);
        
        List<Course> courses = courseService.searchForeachCoursesByTutors(map);
        System.out.println("@@@@@@@@@@@@@@ searchForeachCoursesByTutors"+map);
        Assert.assertNotNull(courses);
        
        for(Course course : courses){
        	Assert.assertNotNull(courses);
        	System.out.println(course);
        }
     }
}