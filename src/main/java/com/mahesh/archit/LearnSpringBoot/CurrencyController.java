package com.mahesh.archit.LearnSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyConfig config;

    @RequestMapping("/currency")
    public CurrencyConfig retrieveConfigs() {
        return config;
    }

}
