package fr.univamu.iut.apicommand.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExternalApiConfig {

    @Value("$http://localhost:8081/APIUserPlate-1.0-SNAPSHOT")
    private String apiUrl;

    @Value("$http://localhost:8081/APIUserPlate-1.0-SNAPSHOT")
    private int apiPort;

    @Value("$http://localhost:8081/APIUserPlate-1.0-SNAPSHOT}")
    private String apiUsername;

    @Value("$http://localhost:8081/APIUserPlate-1.0-SNAPSHOT")
    private String apiPassword;


}
