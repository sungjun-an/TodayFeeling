package com.todayfeeling.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface DemoService {
    Map<String, Object> getDemoData();
}
