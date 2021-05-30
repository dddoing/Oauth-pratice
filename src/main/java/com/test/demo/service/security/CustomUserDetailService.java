package com.test.demo.service.security;

import com.test.demo.entity.User;
import com.test.demo.repo.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class CustomUserDetailService implements UserDetailsService {

    private final UserJpaRepo userJpaRepo;
    private final AccountStatusUserDetailsChecker accountStatusUserDetailsChecker = new AccountStatusUserDetailsChecker();
    //
    @Override
    public UserDetails loadUserByUsername(String username) {
        //
        User user = userJpaRepo.findByUid(username).orElseThrow(()-> new UsernameNotFoundException("not exists"));
        log.info("???{}",user);
        accountStatusUserDetailsChecker.check(user);
        return user;
    }
}
