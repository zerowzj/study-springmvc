package study.spring.mvc.dao.orderitem;

import study.spring.mvc.common.db.BaseEO;

public class OrderItemEO extends BaseEO {

    /* 主键 */
    private Long riId;
    /* 订单号 */
    private Long riOrderId;

    public Long getRiId() {
        return riId;
    }

    public void setRiId(Long riId) {
        this.riId = riId;
    }

    public Long getRiOrderId() {
        return riOrderId;
    }

    public void setRiOrderId(Long riOrderId) {
        this.riOrderId = riOrderId;
    }
}
