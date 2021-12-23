package com.example.simplerest.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService extends org.springframework.security.core.userdetails.UserDetailsService {
    @Override
    UserDetails loadUserByUsername(String mailadress) throws UsernameNotFoundException;

}
