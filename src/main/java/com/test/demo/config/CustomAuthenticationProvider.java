//package com.test.demo.config;
//
//import com.test.demo.entity.User;
//import com.test.demo.repo.UserJpaRepo;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.security.authentication.AuthenticationProvider;
//
//@RequiredArgsConstructor
//@Component
//public class CustomAuthenticationProvider implements AuthenticationProvider{
//
//    private final PasswordEncoder passwordEncoder;
//    private final UserJpaRepo userJpaRepo;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//
//        String name = authentication.getName();
//        String password = authentication.getCredentials().toString();
//
//        User user = userJpaRepo.findByUid(name).orElseThrow(()->new UsernameNotFoundException("user is not exists"));
//
//        if (!passwordEncoder.matches(password,user.getPassword())) {
//            throw new BadCredentialsException("wrong Password");
//        }
//
//        return new UsernamePasswordAuthenticationToken(name,password,user.getAuthorities());
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//}
