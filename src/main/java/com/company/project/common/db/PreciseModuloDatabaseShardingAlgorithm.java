package com.company.project.common.db;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class PreciseModuloDatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PreciseModuloTableShardingAlgorithm.class);

    @Override
    public String doSharding(Collection<String> availableTargetNames,
                             PreciseShardingValue<Long> shardingValue) {
        LOGGER.info("LogicTableName={}, ColumnName={}, Value={}", shardingValue.getLogicTableName(), shardingValue.getColumnName(), shardingValue.getValue());
        for (String targetName : availableTargetNames) {
            LOGGER.info("targetName={}", targetName);
            //这里求余3是因为我这里有三个库，分别是我们在spring-cfg.xml配置的
            if (targetName.endsWith(shardingValue.getValue() % 2 + "")) {
                LOGGER.info("实际库：{}", targetName);
                return targetName;
            }
        }
        throw new UnsupportedOperationException();
    }
}
