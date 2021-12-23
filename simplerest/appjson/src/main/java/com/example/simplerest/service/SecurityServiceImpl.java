package com.example.simplerest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


@Service
public class SecurityServiceImpl implements SecurityService {



    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Override
    public boolean login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken token = null;


        boolean result = false;
        try {
            if (userDetails != null) {
                token = new UsernamePasswordAuthenticationToken(userDetails, password,
                        userDetails.getAuthorities());

               authenticationManager.authenticate(token);

            }


            if (token != null)
                result = token.isAuthenticated();


            if (result) {
                SecurityContextHolder.getContext().setAuthentication(token);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }

        return result;
    }


}
