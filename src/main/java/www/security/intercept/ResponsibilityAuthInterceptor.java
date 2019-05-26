package www.security.intercept;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;

import javax.servlet.*;
import java.io.IOException;
/*
* Created by:joeson
* Created:20190525
* Comment:url职责拦截器，用于判断用户是否拥有访问该url的权限
*  obtainSecurityMetadataSource()方法设置获取对应url角色列表信息服务类
*  setAccessDecisionManager()方法用于设置校验授权服务类
* */
public class ResponsibilityAuthInterceptor extends AbstractSecurityInterceptor implements Filter {

    @Override
    public Class<?> getSecureObjectClass() {
        return null;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return null;
    }


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void setAccessDecisionManager(AccessDecisionManager accessDecisionManager) {
        super.setAccessDecisionManager(accessDecisionManager);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        FilterInvocation fi = new FilterInvocation(servletRequest,servletResponse,filterChain);

    }

    @Override
    public void destroy() {

    }

    public void invoke(FilterInvocation fi){
        /*
        * Comment:传入存储着请求信息的对象，
        * 然后父类的beforeInvocation方法会调用SecurityMetadataSource.getAttributes方法获取该url所 需的角色，
        * 然后调用AccessDecisionManger.decide方法遍历比较登录用户是否存在该角色
        * */
        InterceptorStatusToken token = super.beforeInvocation(fi);
        try {
            // 继续执行下一个拦截器
            fi.getChain().doFilter(fi.getRequest(),fi.getResponse());
        } catch (Exception e) {
            super.afterInvocation(token,null);
        }
    }
}
