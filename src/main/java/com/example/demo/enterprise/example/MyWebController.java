package com.example.demo.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    BusinessService businessService;

    public long ReturnValueFromBusinessService() {
        return businessService.CalculateSum();
    }
}

