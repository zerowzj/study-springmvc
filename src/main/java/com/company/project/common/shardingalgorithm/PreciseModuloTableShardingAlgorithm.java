package com.company.project.common.shardingalgorithm;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 *
 */
public class PreciseModuloTableShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PreciseModuloTableShardingAlgorithm.class);

    @Override
    public String doSharding(Collection<String> availableTargetNames,
                             PreciseShardingValue<Long> shardingValue) {
        LOGGER.info("LogicTableName={}, ColumnName={}, Value={}", shardingValue.getLogicTableName(), shardingValue.getColumnName(), shardingValue.getValue());
        LOGGER.info("AvailableTargetNames={}", availableTargetNames);
        for (String targetName : availableTargetNames) {
            if (targetName.endsWith(shardingValue.getValue() % 2 + "")) {
                LOGGER.info("实际表：{}", targetName);
                return targetName;
            }
        }
        throw new UnsupportedOperationException();
    }
}
