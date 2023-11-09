package com.todayfeeling.service.impl;

import com.todayfeeling.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public Map<String, Object> getDemoData() {
        Map<String, Object> demoData = new HashMap<>();

        demoData.put("test1", "check1");
        demoData.put("test2", "check2");
        demoData.put("test3", "check3");

        return demoData;
    }
}
