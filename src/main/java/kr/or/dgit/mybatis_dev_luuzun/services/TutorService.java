package kr.or.dgit.mybatis_dev_luuzun.services;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_luuzun.dao.TutorMapper;
import kr.or.dgit.mybatis_dev_luuzun.dao.TutorMapperImpl;
import kr.or.dgit.mybatis_dev_luuzun.dto.Tutor;
import kr.or.dgit.mybatis_dev_luuzun.util.MybatisSqlSessionFactory;

public class TutorService implements TutorMapper{
	@Override
	public int insertTutor(Tutor tutor) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			TutorMapperImpl tutorMapperImpl = new TutorMapperImpl(sqlSession);
			return tutorMapperImpl.insertTutor(tutor);
		}
	}
}
