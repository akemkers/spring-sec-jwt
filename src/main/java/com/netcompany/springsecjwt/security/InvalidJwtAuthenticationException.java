package com.netcompany.springsecjwt.security;

/**
 * TODO
 *
 * @author Andreas Kemkers
 */
public class InvalidJwtAuthenticationException extends RuntimeException {

    public InvalidJwtAuthenticationException(final String message) {
        super(message);
    }
}
