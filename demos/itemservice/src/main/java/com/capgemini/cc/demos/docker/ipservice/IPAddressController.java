package com.capgemini.cc.demos.docker.ipservice;

import com.capgemini.cc.demos.docker.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
class IPAddressController {
    private int counter;

    @Autowired
    private ApplicationProperties config;

    @GetMapping(value = "/ip")
    public IPAddress ipaddress() throws Exception {
        return new IPAddress(++counter, InetAddress.getLocalHost().getHostAddress(),
                InetAddress.getLocalHost().getHostName(), config.getMessage());
    }
}

