package com.assignment.registration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

import static com.newrelic.api.agent.NewRelic.addCustomParameters;
import static com.newrelic.api.agent.NewRelic.recordMetric;

@RestController
public class RegistrationController {

    Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @GetMapping(path = "/register")
    String register() {
        logger.info("Incoming request");
        String customerId = UUID.randomUUID().toString();
        sendRegistrationEventToNewRelic(customerId);
        recordMetric("NoOfRegistrations", 1);
        return "Registration Successful and CustomerId is " + customerId;
    }

    private void sendRegistrationEventToNewRelic(String customerId) {
        Map<String, Object> event = Map.of(
                "CustomerId", customerId,
                "Message", "CUSTOMER_REGISTERED"
        );
        addCustomParameters(event);
    }
}
