package www.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import www.security.encryp.SecurityEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    protected void configure(HttpSecurity http) throws Exception{
        /*
        * Created by:joeson
        * Created:201905151934
        * Comment:管理权限的分配
        * */
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
        .antMatchers("/index/**","/**").permitAll()
        .and()
        .formLogin().loginProcessingUrl("/j_spring_security_check").loginPage("/login").failureUrl("/loginError");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        /*
        * Created by:joeson
        * Created:20190515
        * Comment:构建认证类，添加用户的DAO类作为依赖，用于后面通过用户名查询用户信息
        * */
        auth.userDetailsService(userDetailsService()).passwordEncoder(new SecurityEncoder());
    }

    @Bean
    public UserDetailsService userDetailsService(){
        /*
        * Created by:joeson
        * Created:201905151941
        * Comment:用户DAO类，用于通过用户名查询用户信息
        * */
        InMemoryUserDetailsManager userManager = new InMemoryUserDetailsManager();
        userManager.createUser(User.withUsername("joeson").password("joeson").roles("ADMIN").build());
        return userManager;
    }

}
