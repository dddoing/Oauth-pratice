package com.test.demo.controller.common;

import com.google.gson.Gson;
import com.test.demo.model.oauth2.OAuthToken;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/oauth2")
public class Oauth2Controller {

    private final Gson gson;
    private final RestTemplate restTemplate;

    @GetMapping("/callback")
    public OAuthToken callbackSocial(@RequestParam String code) {
        //
        return null;
    }
}
