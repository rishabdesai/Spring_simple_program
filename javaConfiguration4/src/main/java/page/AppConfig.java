package page;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
//@Configuration
public class AppConfig {

	@Bean
	public Account accountImpl() {
		// hard-coded values
		Account a = new AccountImpl(2, "Savings", 9000.00, null);
		return a;
	}

}
