# Registration Application

* This is the registration service to register customers.

# Build & Run the app

* Build the app using `./gradlew clean build` command.
* Run the app using `java -javaagent:newrelic/newrelic.jar -jar build/libs/registration-0.0.1-SNAPSHOT.jar` command.

**Note:** Change `license_key` value in `newrelic/newrelic.yml` by adding your New Relic Account's license key.

# APIs

* /register API to register a customer. It return `CustomerId` as soon as the registration is successful. 

# Application Monitoring using New Relic

* This app is monitored using `APM` service in New Relic using java agent.
* Java agent is enabled by passing `-javaagent:newrelic/newrelic.jar` argument while running the app.
* `newrelic.yml` has configuration related to New Relic.
* All the data will be sent to New Relic under entity name `registration-service`.
* Metrics, Events, Logs & Traces can be viewed in the New Relic.