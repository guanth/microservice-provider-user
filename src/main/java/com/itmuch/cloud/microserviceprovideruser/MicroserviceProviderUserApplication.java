package com.itmuch.cloud.microserviceprovideruser;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class MicroserviceProviderUserApplication {

 /*   public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs(){
        DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs = new DiscoveryClient.DiscoveryClientOptionalArgs();
        List<ClientFilters> new ArrayList<>();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderUserApplication.class, args);
    }

}

