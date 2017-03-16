package kr.or.dgit.mybatis_dev_luuzun.services;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_luuzun.dao.UserMapperImpl;
import kr.or.dgit.mybatis_dev_luuzun.dto.Student;
import kr.or.dgit.mybatis_dev_luuzun.dto.UserPic;
import kr.or.dgit.mybatis_dev_luuzun.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static final Log log = LogFactory.getLog(UserPicService.class);
	private String namespace="kr.or.dgit.mybatis_dev_luuzun.dao.UserPicMapper";

	public int insertUserPic(UserPic userPic) {
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			UserMapperImpl userMapperImpl = new UserMapperImpl(sqlSession);
			return userMapperImpl.insertUserPic(userPic);
		}
	}

	public Student selectUserPicById(int id){
		log.debug("selectUserPicById()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectUserPicById",id);
		}
	}
}
