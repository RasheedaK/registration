package com.assignment.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.newrelic.api.agent.NewRelic.addCustomParameter;
import static com.newrelic.api.agent.NewRelic.recordMetric;

@SpringBootApplication
public class RegistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationApplication.class, args);
    }

}
