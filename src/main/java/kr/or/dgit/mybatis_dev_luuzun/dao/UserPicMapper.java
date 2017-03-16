package kr.or.dgit.mybatis_dev_luuzun.dao;

import kr.or.dgit.mybatis_dev_luuzun.dto.UserPic;

public interface UserPicMapper {
	int insertUserPic(UserPic userPic);
	UserPic selectUserPicById(int id);
}
