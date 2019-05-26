package www.security.authentiaction;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class ResponsibilityAuthProvider implements AuthenticationProvider  {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        /*
        * Comment:用于校验当前登录人是否拥有访问当前URL的职责
        * */
        authentication.getCredentials();
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
