package com.test.demo.encoding;


import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncodingTest {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        System.out.println(passwordEncoder.encode("testSecret"));
    }
}
