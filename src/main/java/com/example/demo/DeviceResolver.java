package com.example.demo;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.hl7.fhir.dstu3.model.Device;
import org.springframework.stereotype.Component;

@Component
public class DeviceResolver implements GraphQLQueryResolver {
    public Device getHello() {
        return new Device();
    }
}
