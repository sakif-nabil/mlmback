package com.mlmbackend.demo.security;//package ma.sid.mlmecomv1.security;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private DataSource dataSource;
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
////        PasswordEncoder passwordEncoder=passwordEncoder();
////        System.out.println("********************");
////        System.out.println(passwordEncoder.encode("1234"));
////        System.out.println("********************");
////     auth.jdbcAuthentication()
////             .dataSource(dataSource)
////             .usersByUsernameQuery("select username as principal, password as credentials, active from users where username=?")
////             .authoritiesByUsernameQuery("select username as principal, role as role from users_roles where username=?")
////             .passwordEncoder(passwordEncoder);
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////      http.formLogin();
////      http.authorizeRequests().antMatchers("/clients").hasRole("ADMIN");
////        http.authorizeRequests().antMatchers().permitAll();
////      http.authorizeRequests().anyRequest().authenticated();
//    }
////    public PasswordEncoder passwordEncoder(){
////        return new BCryptPasswordEncoder();
////    }
//}
