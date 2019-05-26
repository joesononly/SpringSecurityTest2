package www.security.authentiaction;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import java.util.Collection;
import java.util.HashMap;

/*
* Created by:joeson
* Created:20190525
* Comment:用于提供url的角色集合信息，被Interceptor调用
*
* */
public class ResponsibilitySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    private HashMap<String,Collection<ConfigAttribute>> map = null;

    private void loadResourceDefine(){
        /*
        * 获取所有url对应的角色集合，并存储在map变量中
        * */
        map = new HashMap<>();

    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        /*
        * 传入URL名称，返回对应URL的角色集合
        * */
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
