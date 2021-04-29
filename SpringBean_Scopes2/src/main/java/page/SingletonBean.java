package page;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //optional statement, by default singleton
public class SingletonBean {
	// ...
		
	@PostConstruct
	public void init() {
		System.out.println("SingletonBean created.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("SingletonBean destroyed.");
	}

	@Override
	public String toString() {
		return String.format("SingletonBean []");
	}
}
