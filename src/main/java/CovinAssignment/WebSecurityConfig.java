package CovinAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	@Qualifier("userserviceImpl")
	private UserDetailsService userservice;
	  
	@Override protected void configure(AuthenticationManagerBuilder auth) throws
	  Exception { 
		  auth.userDetailsService(userservice);
			
		  
			/*
			 * auth.inMemoryAuthentication().withUser("a")
			 * .password("{noop}p").roles("admin");
			 */
	  }
	 
	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	/*
	 * @Bean public PasswordEncoder passwordEncoder(){ PasswordEncoder encoder = new
	 * BCryptPasswordEncoder(); return encoder; }
	 */
}
