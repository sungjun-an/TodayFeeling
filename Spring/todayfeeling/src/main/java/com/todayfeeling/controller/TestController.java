package com.todayfeeling.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @PostMapping("/login")
    public String getUserInfo(@RequestBody Map<String, String> user) {
        logger.info(user.toString());
        if(user.get("name").equals("name")){
            return "success";
        }
        return "failed";
    }
}
