package com.netcompany.springsecjwt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.netcompany.springsecjwt.repository.UserRepository;

/**
 * TODO
 *
 * @author Andreas Kemkers
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository users;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.users.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("Username: " + username + " not found"));
    }
}
