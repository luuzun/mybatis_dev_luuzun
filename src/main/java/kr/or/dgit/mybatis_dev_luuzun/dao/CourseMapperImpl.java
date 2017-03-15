package kr.or.dgit.mybatis_dev_luuzun.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_luuzun.dto.Course;
import kr.or.dgit.mybatis_dev_luuzun.services.StudentService;

public class CourseMapperImpl implements CourseMapper{
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String namespace="kr.or.dgit.mybatis_dev_luuzun.dao.CourseMapper";
	private SqlSession sqlSession;
	public CourseMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Course> searchCourse(Map<String, Object> param) {
		log.debug("searchCourse()");
		return sqlSession.selectList(namespace+".searchCourse",param);
	}

	@Override
	public List<Course> searchWhereCourses(Map<String, Object> map) {
		log.debug("searchWhereCourses()");
		return sqlSession.selectList(namespace+".searchWhereCourses",map);
	}

	@Override
	public List<Course> searchTrimCourses(Map<String, Object> map) {
		log.debug("searchTrimCourses()");
		return sqlSession.selectList(namespace+".searchTrimCourses",map);
	}

	@Override
	public List<Course> searchForeachCoursesByTutors(Map<String, Object> map) {
		log.debug("searchForeachCoursesByTutors()");
		return sqlSession.selectList(namespace+".searchForeachCoursesByTutors",map);
	}

}
