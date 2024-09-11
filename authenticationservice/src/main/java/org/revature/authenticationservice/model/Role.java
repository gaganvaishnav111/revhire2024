package org.revature.authenticationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Data
@RequiredArgsConstructor
public class Role implements GrantedAuthority {
    private String roleName;

    @Override
    public String getAuthority() {
        return roleName;
    }
}
