/*singleton bean inside prototype beam
- Only one singleton bean object is created
- each call to getBean() creates new prototype bean, but same copy of singleton bean is autowired with them
*/
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
	
	@Autowired
	private SingletonBean innerBean;
	
	@PostConstruct
	public void init() {
		System.out.println("PrototypeBean created.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("PrototypeBean destroyed.");
	}

	public SingletonBean getInnerBean() {
		return innerBean;
	}
	
	@Override
	public String toString() {
		return String.format("PrototypeBean []");
	}
}
