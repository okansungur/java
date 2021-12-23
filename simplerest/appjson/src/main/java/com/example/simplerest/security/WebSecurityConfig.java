package com.example.simplerest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/simple/**", "/showRegistration", "/", "/index.html", "/registerUser", "/register",
                        "/enroll",
                        "/login/register", "/login", "/logout", "/showLogin", "/error", "/error.jsp", "/ships/*")
                .permitAll().antMatchers("/students", "/student", "/student/*", "/addnewStudent/*",
                "/deleteStudent", "/deleteStudent/*", "/newstudent", "/newstudent/*", "/addnewStudent", "/showStudent",
                "/main/*").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN")
                .antMatchers(HttpMethod.GET, "/encyrpt/**").hasAuthority("ROLE_ADMIN")
                //.anyRequest().authenticated()
                .and().csrf().disable()
                .logout()
                .logoutSuccessUrl("/showLogin");

    }


    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {


        return super.authenticationManagerBean();
    }


}
