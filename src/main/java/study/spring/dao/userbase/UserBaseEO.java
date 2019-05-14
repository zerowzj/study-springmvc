package study.spring.dao.userbase;

import study.spring.common.db.BaseEO;
import study.spring.common.db.BaseEO;

public class UserBaseEO extends BaseEO {

    /* 主键 */
    private Long ubId;
    /* 用户编号 */
    private Long ubUserId;
    /* 用户登录名 */
    private String ubLoginName;
    /* 用户登录密码 */
    private String ubLoginPwd;

    public Long getUbId() {
        return ubId;
    }

    public void setUbId(Long ubId) {
        this.ubId = ubId;
    }

    public Long getUbUserId() {
        return ubUserId;
    }

    public void setUbUserId(Long ubUserId) {
        this.ubUserId = ubUserId;
    }

    public String getUbLoginName() {
        return ubLoginName;
    }

    public void setUbLoginName(String ubLoginName) {
        this.ubLoginName = ubLoginName;
    }

    public String getUbLoginPwd() {
        return ubLoginPwd;
    }

    public void setUbLoginPwd(String ubLoginPwd) {
        this.ubLoginPwd = ubLoginPwd;
    }
}
