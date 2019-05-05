package study.spring.common.sharding;

import io.shardingsphere.api.algorithm.sharding.ShardingValue;

import java.util.Collection;

public class Shardings {

    /**
     * @param columnName
     * @param columnValues
     * @return ShardingValue
     */
    public static ShardingValue getShardingValue(String columnName,
                                                 Collection<ShardingValue> columnValues) {
        for (ShardingValue value : columnValues) {
            if (value.getColumnName().equalsIgnoreCase(columnName)) {
                return value;
            }
        }
        return null;
    }
}
