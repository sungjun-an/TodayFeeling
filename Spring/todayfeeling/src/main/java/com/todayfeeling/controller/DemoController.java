package com.todayfeeling.controller;

import com.todayfeeling.service.DemoService;
import com.todayfeeling.service.impl.DemoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {

    DemoService demoService = new DemoServiceImpl();

    @GetMapping("/demo")
    public Map<String, Object> DemoController(){
        return demoService.getDemoData();
    }
}
