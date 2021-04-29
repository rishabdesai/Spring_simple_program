/*prototype bean inside singleton beam
 * - Only one singleton bean object is created
 * - while autowiring singleton bean, prototype bean is created and is injected into singleton bean
 * - since there is one singleton bean, there is single prototype bean.
*/
package page;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //optional statement, by default singleton
public class SingletonBean {
	// ...
		
	@Autowired
	private PrototypeBean innerBean;
	
	@PostConstruct
	public void init() {
		System.out.println("SingletonBean created.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("SingletonBean destroyed.");
	}

	public PrototypeBean getInnerBean() {
		return innerBean;
	}

	public void setInnerBean(PrototypeBean innerBean) {
		this.innerBean = innerBean;
	}

	@Override
	public String toString() {
		return String.format("SingletonBean []");
	}
}
