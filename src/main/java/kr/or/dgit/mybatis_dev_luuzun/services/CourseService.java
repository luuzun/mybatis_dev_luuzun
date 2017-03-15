package kr.or.dgit.mybatis_dev_luuzun.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_luuzun.dao.CourseMapper;
import kr.or.dgit.mybatis_dev_luuzun.dao.CourseMapperImpl;
import kr.or.dgit.mybatis_dev_luuzun.dto.Course;
import kr.or.dgit.mybatis_dev_luuzun.util.MybatisSqlSessionFactory;

public class CourseService implements CourseMapper{
	@Override
	public List<Course> searchCourse(Map<String, Object> param) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapperImpl courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchCourse(param);
		}
	}

	@Override
	public List<Course> searchWhereCourses(Map<String, Object> map) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapperImpl courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchWhereCourses(map);
		}
	}

	@Override
	public List<Course> searchTrimCourses(Map<String, Object> map) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapperImpl courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchTrimCourses(map);
		}
	}

	@Override
	public List<Course> searchForeachCoursesByTutors(Map<String, Object> map) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapperImpl courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchForeachCoursesByTutors(map);
		}
	}
}
