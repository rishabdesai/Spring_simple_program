package page;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	//setter based
	@Bean
	public Box b1() {
		Box b = new BoxImpl();
		b.setLength(5);
		b.setBreadth(4);
		b.setHeight(3);
		return b;
	}
	
	//constructor based
	@Bean
	public Box b2() {
		Box b = new BoxImpl(8, 6, 4);
		return b;
	}
	

	
}

