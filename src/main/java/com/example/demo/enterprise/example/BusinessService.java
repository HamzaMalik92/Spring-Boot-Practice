package com.example.demo.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class BusinessService {
    @Autowired
    private DataService dataService;

    public long CalculateSum() {
        return dataService.getData().stream().reduce(Integer::sum).get();
    }
}