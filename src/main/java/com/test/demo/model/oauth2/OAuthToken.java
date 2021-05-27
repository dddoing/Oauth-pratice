package com.test.demo.model.oauth2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OAuthToken {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private long expires_in;
    private String scope;
    private long refresh_token_expires_in;
}
