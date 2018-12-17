package com.company.project.common.db;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public class PreciseModuloTableShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> availableTargetNames,
                             PreciseShardingValue<Long> shardingValue) {
        for (String each : availableTargetNames) {
            //这里求余3是因为我这里有三个库，分别是我们在spring-cfg.xml配置的
            if (each.endsWith(shardingValue.getValue() % 3 + "")) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
