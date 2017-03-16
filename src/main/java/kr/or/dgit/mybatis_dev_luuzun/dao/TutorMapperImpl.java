package kr.or.dgit.mybatis_dev_luuzun.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_luuzun.dto.Tutor;
import kr.or.dgit.mybatis_dev_luuzun.services.StudentService;

public class TutorMapperImpl implements TutorMapper{
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String namespace="kr.or.dgit.mybatis_dev_luuzun.dao.TutorMapper";
	private SqlSession sqlSession;
	public TutorMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public int insertTutor(Tutor tutor) {
		log.debug("insertTutor()");
		return sqlSession.insert(namespace+".insertTutor",tutor);
	}
}
