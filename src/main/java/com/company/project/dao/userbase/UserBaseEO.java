package com.company.project.dao.userbase;


import com.company.project.common.db.BaseEO;

/**
 * 用户基本信息EO
 *
 * @author wangzhj
 */
public class UserBaseEO extends BaseEO {

    /* 用户编号 */
    private Long ubId;
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
