package study.spring.dao.userbase;

import study.spring.common.db.BaseDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import study.spring.common.db.BaseDao;

import java.util.List;

@Repository("userBaseDao")
public interface UserBaseDao extends BaseDao<Long, UserBaseEO> {

    UserBaseEO getByUserId(Long userId);

    List<UserBaseEO> getLt(@Param("ubIdLt") List<Long> ubIdLt, @Param("userIdLt") List<Long> userIdLt);
}
