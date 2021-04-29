
package page;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
	// ...
	
	@PostConstruct
	public void init() {
		System.out.println("PrototypeBean created.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("PrototypeBean destroyed.");
	}

	@Override
	public String toString() {
		return String.format("PrototypeBean []");
	}
}
