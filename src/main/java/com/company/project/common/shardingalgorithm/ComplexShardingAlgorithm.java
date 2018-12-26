package com.company.project.common.shardingalgorithm;

import io.shardingsphere.api.algorithm.sharding.ShardingValue;
import io.shardingsphere.api.algorithm.sharding.complex.ComplexKeysShardingAlgorithm;

import java.util.Collection;

public class ComplexShardingAlgorithm implements ComplexKeysShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames,
                                         Collection<ShardingValue> shardingValues) {

        return null;
    }
}
