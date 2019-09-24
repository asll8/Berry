package edu.sabanciuniv.berry.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;


	private static final String[] PUBLIC_MATCHERS = {
			"/css/**",
			"/js/**",
			"/images/**",
			"/",
			"/myAccount",
			"welcome",
			"/home",
			"/index",
			"/register",
			"/fontawesome-free/**",
			"/templates/**",
			"/static/**",
			"/jquery/**",
			"/simple-line-icons/**",
			"/**",
			"/welcome",
			"login"
	};
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests().
			antMatchers(PUBLIC_MATCHERS).
			permitAll().anyRequest().authenticated();
		http
			.csrf().disable().cors().disable()
			.formLogin().failureUrl("/login").defaultSuccessUrl("/")
			.loginPage("/login").permitAll()
			.and()
			.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/index").deleteCookies("remember-me").permitAll()
			.and()
			.rememberMe();
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
          .withUser("spring")
          .password(encoder.encode("secret"))
          .roles("USER");
		
	}


	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery(
		  			"select username, password, enabled from user where username=?")
				.authoritiesByUsernameQuery(
		  			"select username, role from authority where username=?");
	}
	

}
