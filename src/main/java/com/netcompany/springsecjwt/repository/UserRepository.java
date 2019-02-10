package com.netcompany.springsecjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netcompany.springsecjwt.model.User;

/**
 * TODO
 *
 * @author Andreas Kemkers
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
