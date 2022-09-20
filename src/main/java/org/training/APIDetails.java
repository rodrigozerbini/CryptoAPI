package org.training;

public class APIDetails {

    // Host URL
    private String host;

    // Header for a request
    private String key;

    public APIDetails() {
        host = "coinranking1.p.rapidapi.com";
        key = "2b257e9c26mshee89e8fff32ea87p15abb9jsn4a9a310848b8";
    }

    public String getHost() {
        return host;
    }

    public String getKey() {
        return key;
    }
}
