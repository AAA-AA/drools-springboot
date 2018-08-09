package com.github.drools.engine;


import com.github.drools.model.PointDomain;

/**
 * @author : hongqiangren.
 * @since: 2018/8/7 12:37
 */
public interface PointRuleEngine {
    void executeRuleEngine(final PointDomain pointDomain);
}