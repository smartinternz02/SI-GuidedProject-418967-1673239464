package config;
import org.springframework.context.annotation.Configuration;
import controller.EnableWebSecurity;
import controller.HttpSecurity;
import controller.WebSecurityConfigurerAdapter;

public class config {
	@Configuration
	@EnableWebSecurity
	public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/Register").permitAll()
			.antMatchers("/Login").permitAll()
			.antMatchers("/home").permitAll();
			
		}
	}
	Footer
	© 2023 GitHub, Inc.
	Footer navigation
	Terms
	Privacy
	Security
}
