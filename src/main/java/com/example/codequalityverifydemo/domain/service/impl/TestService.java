package com.example.codequalityverifydemo.domain.service.impl;

import com.example.codequalityverifydemo.domain.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {

    public String print(String msg) {
      System.out.println(msg);
        return msg;
    }
}
