package com.test.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@Configuration
@ConfigurationProperties(prefix = "oauth2-config")
public class ServiceConfig {

    @Value("${security.oauth2.jwt.signkey}")
    private String jwtSigningKey;

    @Data
    public static class Client {
        private String id;
        private String secret;
        private String scope;
    }

    private Client client;

    private List<String> grantTypes;

    private String redirectUrl;
}
