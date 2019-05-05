package study.spring.common.db;

import java.io.Serializable;

public interface BaseDao<PK extends Serializable, E extends BaseEO> {

    int insert(E entity);

    int update(E entity);

    E get(PK pk);

    int delete(PK pk);
}
