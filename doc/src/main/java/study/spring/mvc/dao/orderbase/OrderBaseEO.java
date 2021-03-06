package study.spring.mvc.dao.orderbase;

import study.spring.mvc.common.db.BaseEO;

public class OrderBaseEO extends BaseEO {

    /* 主键 */
    private Long rbId;
    /* 订单号 */
    private Long rbOrderId;

    public Long getRbId() {
        return rbId;
    }

    public void setRbId(Long rbId) {
        this.rbId = rbId;
    }

    public Long getRbOrderId() {
        return rbOrderId;
    }

    public void setRbOrderId(Long rbOrderId) {
        this.rbOrderId = rbOrderId;
    }
}
