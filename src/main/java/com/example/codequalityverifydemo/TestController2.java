package com.example.codequalityverifydemo;

import com.example.codequalityverifydemo.domain.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

    private final ITestService testService;

    @Autowired
    public TestController2(ITestService testService) {
        this.testService = testService;
    }

    @GetMapping("/say2/{msg}")
    public String say(@PathVariable String msg){

        return testService.print(msg);
    }
}
