package com.example.sleuthhttptracingendpoint;

import brave.http.HttpTracing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Endpoint(id = "my-endpoint")
    @Component
    public static class MyEndpoint {
        public MyEndpoint(HttpTracing httpTracing) {
            // do something with httpTracing
        }
    }
}
