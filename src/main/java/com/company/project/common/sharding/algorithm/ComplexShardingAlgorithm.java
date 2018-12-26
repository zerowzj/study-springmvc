package com.company.project.common.sharding.algorithm;

import io.shardingsphere.api.algorithm.sharding.ShardingValue;
import io.shardingsphere.api.algorithm.sharding.complex.ComplexKeysShardingAlgorithm;

import java.util.Collection;

/**
 * 取模分片算法
 *
 * @author wangzhj
 */
public class ComplexShardingAlgorithm implements ComplexKeysShardingAlgorithm {

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames,
                                         Collection<ShardingValue> shardingValues) {

        return null;
    }
}
