package com.github.drools.controller;

import com.alibaba.fastjson.JSON;
import com.github.drools.engine.PointRuleEngine;
import com.github.drools.model.PointDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointController {

    @Autowired
    private PointRuleEngine pointRuleEngine;

    @RequestMapping("/rules/point")
    public String getPoint(PointDomain pointDomain) {
        pointRuleEngine.executeRuleEngine(pointDomain);
        int point = pointDomain.getPoint();
        System.out.println(JSON.toJSON(pointDomain));
        return JSON.toJSONString(point);
    }
}