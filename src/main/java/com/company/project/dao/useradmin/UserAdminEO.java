package com.company.project.dao.useradmin;


import com.company.project.dao.userbase.UserBaseEO;

/**
 * 用户基本信息EO
 *
 * @author wangzhj
 */
public class UserAdminEO extends UserBaseEO {

    /* 用户编号 */
    private Long uaId;

    public Long getUaId() {
        return uaId;
    }

    public void setUaId(Long uaId) {
        this.uaId = uaId;
    }
}
