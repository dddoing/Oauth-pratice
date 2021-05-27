package com.test.demo.controller;

import com.test.demo.entity.User;
import com.test.demo.repo.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserController {
    //
    private final UserJpaRepo userJpaRepo;

    @PreAuthorize("#oauth2.hasScope('write')")
    @GetMapping(value = "/users")
    public List<User> findAllUser() {return userJpaRepo.findAll();}
}
