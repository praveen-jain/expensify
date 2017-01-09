package com.crizillion.expensify.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
	}
	
	protected void configure(HttpSecurity http) throws Exception {
	    http
	    	.authorizeRequests().anyRequest().authenticated()
	    	.and()
	    		.formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/dashboard", true);
	    http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}

}
