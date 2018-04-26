package com.capgemini.cc.demos.docker.ipservice;

class IPAddress {
    private final long id;
    private final String ipAddress;
    private final String hostName;
    private String message;

    public IPAddress(long id, String ipAddress, String hostName, String message) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.hostName = hostName;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getHostName() {
        return hostName;
    }

    public String getMessage() {
        return message;
    }
}