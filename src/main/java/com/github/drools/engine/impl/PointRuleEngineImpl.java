package com.github.drools.engine.impl;

import com.github.drools.engine.PointRuleEngine;
import com.github.drools.model.PointDomain;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : hongqiangren.
 * @since: 2018/8/7 12:41
 */
@Service
public class PointRuleEngineImpl implements PointRuleEngine {

    @Autowired
    private KieSession kieSession;

    @Override
    public void executeRuleEngine(PointDomain pointDomain) {
        kieSession.insert(pointDomain);
        int rules = kieSession.fireAllRules();
        System.out.println("共验证" + rules + "条规则！");
    }
}
