package com.test.demo.repo;

import com.test.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJpaRepoTest {

    @Autowired
    private UserJpaRepo userJpaRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertNewUser() {
        //
        userJpaRepo.save(User.builder().uid("sample@test.com").password(passwordEncoder.encode("1234"))
                        .name("Test").roles(Collections.singletonList("ROLE_USER")).build()
        );
    }
}
