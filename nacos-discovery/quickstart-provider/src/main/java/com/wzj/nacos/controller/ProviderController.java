package com.wzj.nacos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    private static final Logger log=LoggerFactory
            .getLogger(ProviderController.class);

    @GetMapping("/service")
    public String service(){
        log.info("provider");
        return "provider";
    }
}
