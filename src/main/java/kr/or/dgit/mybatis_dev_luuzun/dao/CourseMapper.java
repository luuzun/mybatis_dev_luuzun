package kr.or.dgit.mybatis_dev_luuzun.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev_luuzun.dto.Course;

public interface CourseMapper {
	List<Course> searchCourse(Map<String, Object> param);
	List<Course> searchWhereCourses(Map<String, Object> map);
	List<Course> searchTrimCourses(Map<String, Object> map);
	List<Course> searchForeachCoursesByTutors(Map<String, Object> map);
}
