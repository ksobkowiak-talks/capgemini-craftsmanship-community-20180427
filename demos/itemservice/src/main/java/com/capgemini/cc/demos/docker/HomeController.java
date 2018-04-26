package com.capgemini.cc.demos.docker;

import com.capgemini.cc.demos.docker.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private ApplicationProperties properties;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return properties.getWelcomeMessage();
    }

}
