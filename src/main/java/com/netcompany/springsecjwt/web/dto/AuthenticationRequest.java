package com.netcompany.springsecjwt.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO
 *
 * @author Andreas Kemkers
 */

@Data
@AllArgsConstructor @NoArgsConstructor
public class AuthenticationRequest {

    private String username;
    private String password;

}
