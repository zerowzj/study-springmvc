package com.company.project.common.shardingalgorithm;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * 取模分片算法
 *
 * @author wangzhj
 */
public class ModuloShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModuloShardingAlgorithm.class);

    private int shardingCount;

    public ModuloShardingAlgorithm(int shardingCount) {
        this.shardingCount = shardingCount;
    }

    @Override
    public String doSharding(Collection<String> availableTargetNames,
                             PreciseShardingValue<Long> shardingValue) {
        LOGGER.info("LogicTableName={}, ColumnName={}, Value={}", shardingValue.getLogicTableName(), shardingValue.getColumnName(), shardingValue.getValue());
        LOGGER.info("AvailableTargetNames={}", availableTargetNames);
        for (String targetName : availableTargetNames) {
            long mod = shardingValue.getValue() % shardingCount;
            if (targetName.endsWith(String.valueOf(mod))) {
                LOGGER.info("ActualTargetName：{}", targetName);
                return targetName;
            }
        }
        throw new UnsupportedOperationException();
    }
}
