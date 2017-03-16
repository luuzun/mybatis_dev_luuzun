package kr.or.dgit.mybatis_dev_luuzun.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_luuzun.dto.UserPic;

public class UserMapperImpl implements UserPicMapper{
	private static final Log log = LogFactory.getLog(UserMapperImpl.class);
	private String namespace ="kr.or.dgit.mybatis_dev_luuzun.dao.UserPicMapper.";
	private SqlSession sqlSession;
	public UserMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public int insertUserPic(UserPic userPic) {
		log.debug("insertUserPic()");
		return sqlSession.insert(namespace+"insertUserPic",userPic);
	}

	@Override
	public UserPic selectUserPicById(int id) {
		log.debug("selectUserPicById()");
		return sqlSession.selectOne(namespace+"selectUserPicById",id);
	}

}
