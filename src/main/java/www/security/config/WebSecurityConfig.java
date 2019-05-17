package www.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import www.security.Service.SecurityUserDetailService;
import www.security.encry.SecurityEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    SecurityUserDetailService userDetailsService;

    protected void configure(HttpSecurity http) throws Exception{
        /*
        * Created by:joeson
        * Created:20190517
        * Comment:设置URL权限管理
        * */
        //取消跨域验证
        http.csrf().disable();
        //设置需要认证的URL
        http.authorizeRequests().antMatchers("/admin").hasRole("USER");
        //设置登录校验的相关url
        http.formLogin().loginProcessingUrl("/loginCheck").loginPage("/login").failureUrl("/error");
        //设置放行其他URL
        http.authorizeRequests().anyRequest().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*
        * Created by:joeson
        * Created:201905171013
        * Comment:设置验证用户的DAO类，以及密码加密类
        * */
        super.configure(auth);
        auth.userDetailsService(userDetailsService).passwordEncoder(new SecurityEncoder());
    }

    /*
    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("joeson").password("joeson").roles("USER").build());
        return manager;
    }*/

}
