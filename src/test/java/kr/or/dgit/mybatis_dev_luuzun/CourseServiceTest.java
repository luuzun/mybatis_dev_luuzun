package kr.or.dgit.mybatis_dev_luuzun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev_luuzun.dto.UserPic;
import kr.or.dgit.mybatis_dev_luuzun.services.CourseService;
import kr.or.dgit.mybatis_dev_luuzun.services.TutorService;
import kr.or.dgit.mybatis_dev_luuzun.services.UserPicService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //메서드 이름 순서대로 Test
public class CourseServiceTest {
	private static CourseService courseService;
	private static TutorService tutorService;
	private static UserPicService userPicService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforClass()");
		courseService = new CourseService();
		tutorService = new TutorService();
		userPicService = new UserPicService();
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
	 
/*	 @Test
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
	 
	 @Test
     public void TestinsertTutor() {
		Tutor tutor = new Tutor(12, "이교민", "jsw@test.co.kr", Gender.FEMALE);
		int res = tutorService.insertTutor(tutor);
        Assert.assertEquals(1, res);
     }*/
	
	@Test
    public void Test() {
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir")+"\\DataFiles\\kms.jpg");
		try (InputStream is = new FileInputStream(file);){
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		UserPic userPic = new UserPic(1,"김민수",pic,"...");
		int res = userPicService.insertUserPic(userPic);
		Assert.assertEquals(1, res);
	}
}